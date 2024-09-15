package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.LogroDto;
import com.academiaspedropaulet.academia.mappers.LogroMapper;
import com.academiaspedropaulet.academia.modelo.Logro;
import com.academiaspedropaulet.academia.modelo.Logro;
import com.academiaspedropaulet.academia.servicio.LogroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/logro")
public class LogroController {
    private final LogroService logroService;
    private final LogroMapper logroMapper;

    @GetMapping("/list")
    public ResponseEntity<List<LogroDto>> findAll() {
        List<LogroDto> p=logroMapper.toDTOs(logroService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<LogroDto> findByPeriodo(@PathVariable Long id) {
        LogroDto p=logroMapper.toDTO(logroService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody LogroDto logroDto) {
        logroService.save(logroMapper.toEntity(logroDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        logroService.delete(id);
    }
}
