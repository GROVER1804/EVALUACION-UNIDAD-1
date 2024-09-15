package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.EstudianteDto;
import com.academiaspedropaulet.academia.mappers.EstudianteMapper;
import com.academiaspedropaulet.academia.modelo.Estudiante;
import com.academiaspedropaulet.academia.modelo.Estudiante;
import com.academiaspedropaulet.academia.servicio.EstudianteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    private final EstudianteService estudianteService;
    private final EstudianteMapper estudianteMapper;

    @GetMapping("/list")
    public ResponseEntity<List<EstudianteDto>> findAll() {
        List<EstudianteDto> p=estudianteMapper.toDTOs(estudianteService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<EstudianteDto> findByPeriodo(@PathVariable Long id) {
        EstudianteDto p=estudianteMapper.toDTO(estudianteService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody EstudianteDto estudianteDto) {
        estudianteService.save(estudianteMapper.toEntity(estudianteDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        estudianteService.delete(id);
    }
}
