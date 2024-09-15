package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.InstitucionDto;
import com.academiaspedropaulet.academia.mappers.InstitucionMapper;
import com.academiaspedropaulet.academia.modelo.Institucion;
import com.academiaspedropaulet.academia.modelo.Institucion;
import com.academiaspedropaulet.academia.servicio.InstitucionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/institucion")
public class InstitucionController {
    private final InstitucionService institucionService;
    private final InstitucionMapper institucionMapper;

    @GetMapping("/list")
    public ResponseEntity<List<InstitucionDto>> findAll() {
        List<InstitucionDto> p=institucionMapper.toDTOs(institucionService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<InstitucionDto> findByPeriodo(@PathVariable Long id) {
        InstitucionDto p=institucionMapper.toDTO(institucionService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody InstitucionDto institucionDto) {
        institucionService.save(institucionMapper.toEntity(institucionDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        institucionService.delete(id);
    }
}
