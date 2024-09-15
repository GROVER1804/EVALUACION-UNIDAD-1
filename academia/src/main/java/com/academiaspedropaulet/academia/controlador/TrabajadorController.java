package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.TrabajadorDto;
import com.academiaspedropaulet.academia.mappers.TrabajadorMapper;
import com.academiaspedropaulet.academia.modelo.Trabajador;
import com.academiaspedropaulet.academia.modelo.Trabajador;
import com.academiaspedropaulet.academia.servicio.TrabajadorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {
    private final TrabajadorService trabajadorService;
    private final TrabajadorMapper trabajadorMapper;

    @GetMapping("/list")
    public ResponseEntity<List<TrabajadorDto>> findAll() {
        List<TrabajadorDto> p=trabajadorMapper.toDTOs(trabajadorService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<TrabajadorDto> findByPeriodo(@PathVariable Long id) {
        TrabajadorDto p=trabajadorMapper.toDTO(trabajadorService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody TrabajadorDto periodo) {
        trabajadorService.save(trabajadorMapper.toEntity(periodo));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        trabajadorService.delete(id);
    }
}
