package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.SedeinstitucionDto;
import com.academiaspedropaulet.academia.mappers.SedeinstitucionMapper;
import com.academiaspedropaulet.academia.modelo.Sedeinstitucion;
import com.academiaspedropaulet.academia.modelo.Sedeinstitucion;
import com.academiaspedropaulet.academia.servicio.SedeinstitucionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/sedeinstitucion")
public class SedeinstitucionController {
    private final SedeinstitucionService sedeinstitucionService;
    private final SedeinstitucionMapper sedeinstitucionMapper;

    @GetMapping("/list")
    public ResponseEntity<List<SedeinstitucionDto>> findAll() {
        List<SedeinstitucionDto> p=sedeinstitucionMapper.toDTOs(sedeinstitucionService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<SedeinstitucionDto> findByPeriodo(@PathVariable Long id) {
        SedeinstitucionDto p=sedeinstitucionMapper.toDTO(sedeinstitucionService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody SedeinstitucionDto sedeinstitucionDto) {
        sedeinstitucionService.save(sedeinstitucionMapper.toEntity(sedeinstitucionDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        sedeinstitucionService.delete(id);
    }
}
