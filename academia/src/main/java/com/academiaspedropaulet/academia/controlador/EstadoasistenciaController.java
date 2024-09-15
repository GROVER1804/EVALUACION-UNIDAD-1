package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.EstadoasistenciaDto;
import com.academiaspedropaulet.academia.mappers.EstadoasistenciaMapper;
import com.academiaspedropaulet.academia.modelo.Estadoasistencia;
import com.academiaspedropaulet.academia.modelo.Estadoasistencia;
import com.academiaspedropaulet.academia.servicio.EstadoasistenciaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/estadoasistencia")
public class EstadoasistenciaController {
    private final EstadoasistenciaService estadoasistenciaService;
    private final EstadoasistenciaMapper estadoasistenciaMapper;

    @GetMapping("/list")
    public ResponseEntity<List<EstadoasistenciaDto>> findAll() {
        List<EstadoasistenciaDto> p=estadoasistenciaMapper.toDTOs(estadoasistenciaService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<EstadoasistenciaDto> findByPeriodo(@PathVariable Long id) {
        EstadoasistenciaDto p=estadoasistenciaMapper.toDTO(estadoasistenciaService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody EstadoasistenciaDto estadoasistenciaDto) {
        estadoasistenciaService.save(estadoasistenciaMapper.toEntity(estadoasistenciaDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        estadoasistenciaService.delete(id);
    }
}
