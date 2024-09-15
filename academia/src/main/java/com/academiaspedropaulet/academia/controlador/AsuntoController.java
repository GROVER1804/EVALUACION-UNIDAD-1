package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.AsuntoDto;
import com.academiaspedropaulet.academia.mappers.AsuntoMapper;
import com.academiaspedropaulet.academia.modelo.Asunto;
import com.academiaspedropaulet.academia.servicio.AsuntoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/asunto")
public class AsuntoController {
    private final AsuntoService asuntoService;
    private final AsuntoMapper asuntoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<AsuntoDto>> findAll() {
        List<AsuntoDto> p=asuntoMapper.toDTOs(asuntoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<AsuntoDto> findByPeriodo(@PathVariable Long id) {
        AsuntoDto p=asuntoMapper.toDTO(asuntoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody AsuntoDto asuntoDto) {
        asuntoService.save(asuntoMapper.toEntity(asuntoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        asuntoService.delete(id);
    }
}
