package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.PeriodoDto;
import com.academiaspedropaulet.academia.mappers.PeriodoMapper;
import com.academiaspedropaulet.academia.modelo.Periodo;
import com.academiaspedropaulet.academia.modelo.Periodo;
import com.academiaspedropaulet.academia.servicio.PeriodoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/periodo")
public class PeriodoController {
    private final PeriodoService periodoService;
    private final PeriodoMapper periodoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<PeriodoDto>> findAll() {
        List<PeriodoDto> p=periodoMapper.toDTOs(periodoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<PeriodoDto> findByPeriodo(@PathVariable Long id) {
        PeriodoDto p=periodoMapper.toDTO(periodoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody PeriodoDto periodoDto) {
        periodoService.save(periodoMapper.toEntity(periodoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        periodoService.delete(id);
    }
}
