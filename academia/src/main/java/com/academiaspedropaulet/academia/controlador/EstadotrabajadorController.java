package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.EstadotrabajadorDto;
import com.academiaspedropaulet.academia.mappers.EstadotrabajadorMapper;
import com.academiaspedropaulet.academia.modelo.Estadotrabajador;
import com.academiaspedropaulet.academia.modelo.Estadotrabajador;
import com.academiaspedropaulet.academia.servicio.EstadotrabajadorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/estadotrabajador")
public class EstadotrabajadorController {
    private final EstadotrabajadorService estadotrabajadorService;
    private final EstadotrabajadorMapper estadotrabajadorMapper;

    @GetMapping("/list")
    public ResponseEntity<List<EstadotrabajadorDto>> findAll() {
        List<EstadotrabajadorDto> p=estadotrabajadorMapper.toDTOs(estadotrabajadorService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<EstadotrabajadorDto> findByPeriodo(@PathVariable Long id) {
        EstadotrabajadorDto p=estadotrabajadorMapper.toDTO(estadotrabajadorService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody EstadotrabajadorDto estadotrabajadorDto) {
        estadotrabajadorService.save(estadotrabajadorMapper.toEntity(estadotrabajadorDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        estadotrabajadorService.delete(id);
    }
}
