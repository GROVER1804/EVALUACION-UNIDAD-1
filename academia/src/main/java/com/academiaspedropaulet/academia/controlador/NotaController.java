package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.NotaDto;
import com.academiaspedropaulet.academia.mappers.NotaMapper;
import com.academiaspedropaulet.academia.modelo.Nota;
import com.academiaspedropaulet.academia.modelo.Nota;
import com.academiaspedropaulet.academia.servicio.NotaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/nota")
public class NotaController {
    private final NotaService notaService;
    private final NotaMapper notaMapper;

    @GetMapping("/list")
    public ResponseEntity<List<NotaDto>> findAll() {
        List<NotaDto> p=notaMapper.toDTOs(notaService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<NotaDto> findByPeriodo(@PathVariable Long id) {
        NotaDto p=notaMapper.toDTO(notaService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody NotaDto notaDto) {
        notaService.save(notaMapper.toEntity(notaDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        notaService.delete(id);
    }
}
