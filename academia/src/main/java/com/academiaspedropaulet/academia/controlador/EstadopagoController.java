package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.EstadopagoDto;
import com.academiaspedropaulet.academia.mappers.EstadopagoMapper;
import com.academiaspedropaulet.academia.modelo.Estadopago;
import com.academiaspedropaulet.academia.modelo.Estadopago;
import com.academiaspedropaulet.academia.servicio.EstadopagoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/estadopago")
public class EstadopagoController {
    private final EstadopagoService estadopagoService;
    private final EstadopagoMapper estadopagoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<EstadopagoDto>> findAll() {
        List<EstadopagoDto> p=estadopagoMapper.toDTOs(estadopagoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<EstadopagoDto> findByPeriodo(@PathVariable Long id) {
        EstadopagoDto p=estadopagoMapper.toDTO(estadopagoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody EstadopagoDto estadopagoDto) {
        estadopagoService.save(estadopagoMapper.toEntity(estadopagoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        estadopagoService.delete(id);
    }
}
