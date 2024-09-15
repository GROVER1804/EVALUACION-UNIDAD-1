package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.SeccionDto;
import com.academiaspedropaulet.academia.mappers.SeccionMapper;
import com.academiaspedropaulet.academia.modelo.Seccion;
import com.academiaspedropaulet.academia.modelo.Seccion;
import com.academiaspedropaulet.academia.servicio.SeccionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/seccion")
public class SeccionController {
    private final SeccionService seccionService;
    private final SeccionMapper seccionMapper;

    @GetMapping("/list")
    public ResponseEntity<List<SeccionDto>> findAll() {
        List<SeccionDto> p=seccionMapper.toDTOs(seccionService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<SeccionDto> findByPeriodo(@PathVariable Long id) {
        SeccionDto p=seccionMapper.toDTO(seccionService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody SeccionDto periodo) {
        seccionService.save(seccionMapper.toEntity(periodo));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        seccionService.delete(id);
    }
}
