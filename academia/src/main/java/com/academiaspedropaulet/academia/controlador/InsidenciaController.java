package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.InsidenciaDto;
import com.academiaspedropaulet.academia.mappers.InsidenciaMapper;
import com.academiaspedropaulet.academia.modelo.Insidencia;
import com.academiaspedropaulet.academia.modelo.Insidencia;
import com.academiaspedropaulet.academia.servicio.InsidenciaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/insidencia")
public class InsidenciaController {
    private final InsidenciaService insidenciaService;
    private final InsidenciaMapper insidenciaMapper;

    @GetMapping("/list")
    public ResponseEntity<List<InsidenciaDto>> findAll() {
        List<InsidenciaDto> p=insidenciaMapper.toDTOs(insidenciaService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<InsidenciaDto> findByPeriodo(@PathVariable Long id) {
        InsidenciaDto p=insidenciaMapper.toDTO(insidenciaService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody InsidenciaDto insidenciaDto) {
        insidenciaService.save(insidenciaMapper.toEntity(insidenciaDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        insidenciaService.delete(id);
    }
}
