package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.MedioInteresDto;
import com.academiaspedropaulet.academia.mappers.MedioInteresMapper;
import com.academiaspedropaulet.academia.modelo.MedioInteres;
import com.academiaspedropaulet.academia.modelo.MedioInteres;
import com.academiaspedropaulet.academia.servicio.MedioInteresService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/mediointeres")
public class MedioInteresController {
    private final MedioInteresService medioInteresService;
    private final MedioInteresMapper medioInteresMapper;

    @GetMapping("/list")
    public ResponseEntity<List<MedioInteresDto>> findAll() {
        List<MedioInteresDto> p=medioInteresMapper.toDTOs(medioInteresService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<MedioInteresDto> findByPeriodo(@PathVariable Long id) {
        MedioInteresDto p=medioInteresMapper.toDTO(medioInteresService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody MedioInteresDto medioInteresDto) {
        medioInteresService.save(medioInteresMapper.toEntity(medioInteresDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        medioInteresService.delete(id);
    }
}
