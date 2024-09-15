package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.CupoDto;
import com.academiaspedropaulet.academia.mappers.CupoMapper;
import com.academiaspedropaulet.academia.modelo.Cupo;
import com.academiaspedropaulet.academia.modelo.Cupo;
import com.academiaspedropaulet.academia.servicio.CupoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/cupo")
public class CupoController {
    private final CupoService cupoService;
    private final CupoMapper cupoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<CupoDto>> findAll() {
        List<CupoDto> p=cupoMapper.toDTOs(cupoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<CupoDto> findByPeriodo(@PathVariable Long id) {
        CupoDto p=cupoMapper.toDTO(cupoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody CupoDto cupoDto) {
        cupoService.save(cupoMapper.toEntity(cupoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        cupoService.delete(id);
    }
}
