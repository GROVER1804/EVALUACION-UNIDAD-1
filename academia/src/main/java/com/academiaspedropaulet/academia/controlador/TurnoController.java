package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.TurnoDto;
import com.academiaspedropaulet.academia.mappers.TurnoMapper;
import com.academiaspedropaulet.academia.modelo.Turno;
import com.academiaspedropaulet.academia.modelo.Turno;
import com.academiaspedropaulet.academia.servicio.TurnoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/turno")
public class TurnoController {

    private final TurnoService turnoService;
    private final TurnoMapper turnoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<TurnoDto>> findAll() {
        List<TurnoDto> p=turnoMapper.toDTOs(turnoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<TurnoDto> findByPeriodo(@PathVariable Long id) {
        TurnoDto p=turnoMapper.toDTO(turnoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody TurnoDto turnoDto) {
        turnoService.save(turnoMapper.toEntity(turnoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        turnoService.delete(id);
    }
}
