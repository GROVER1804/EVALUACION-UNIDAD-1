package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.AsistenciacursoDto;
import com.academiaspedropaulet.academia.mappers.AsistenciacursoMapper;
import com.academiaspedropaulet.academia.modelo.Asistenciacurso;
import com.academiaspedropaulet.academia.servicio.AsistenciacursoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/asistenciacurso")
public class AsistenciacursoController {
    private final AsistenciacursoService asistenciacursoService;
    private final AsistenciacursoMapper asistenciacursoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<AsistenciacursoDto>> findAll() {
        List<AsistenciacursoDto> p=asistenciacursoMapper.toDTOs(asistenciacursoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<AsistenciacursoDto> findByPeriodo(@PathVariable Long id) {
        AsistenciacursoDto p=asistenciacursoMapper.toDTO(asistenciacursoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody AsistenciacursoDto asistenciacursoDto) {
        asistenciacursoService.save(asistenciacursoMapper.toEntity(asistenciacursoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        asistenciacursoService.delete(id);
    }
}
