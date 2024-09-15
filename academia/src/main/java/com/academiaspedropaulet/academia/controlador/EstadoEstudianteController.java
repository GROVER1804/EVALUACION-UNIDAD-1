package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.EstadoEstudianteDto;
import com.academiaspedropaulet.academia.mappers.EstadoEstudianteMapper;
import com.academiaspedropaulet.academia.modelo.EstadoEstudiante;
import com.academiaspedropaulet.academia.modelo.EstadoEstudiante;
import com.academiaspedropaulet.academia.servicio.EstadoEstudianteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/estadoestudiante")
public class EstadoEstudianteController {
    private final EstadoEstudianteService estadoEstudianteService;
    private final EstadoEstudianteMapper estadoEstudianteMapper;

    @GetMapping("/list")
    public ResponseEntity<List<EstadoEstudianteDto>> findAll() {
        List<EstadoEstudianteDto> p=estadoEstudianteMapper.toDTOs(estadoEstudianteService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<EstadoEstudianteDto> findByPeriodo(@PathVariable Long id) {
        EstadoEstudianteDto p=estadoEstudianteMapper.toDTO(estadoEstudianteService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody EstadoEstudianteDto estadoEstudianteDto) {
        estadoEstudianteService.save(estadoEstudianteMapper.toEntity(estadoEstudianteDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        estadoEstudianteService.delete(id);
    }
}
