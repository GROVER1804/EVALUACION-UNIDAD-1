package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.CompetenciaDto;
import com.academiaspedropaulet.academia.mappers.CompetenciaMapper;
import com.academiaspedropaulet.academia.modelo.Competencia;
import com.academiaspedropaulet.academia.modelo.Competencia;
import com.academiaspedropaulet.academia.servicio.CompetenciaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/competencia")
public class CompetenciaController {
    private final CompetenciaService competenciaService;
    private final CompetenciaMapper competenciaMapper;

    @GetMapping("/list")
    public ResponseEntity<List<CompetenciaDto>> findAll() {
        List<CompetenciaDto> p=competenciaMapper.toDTOs(competenciaService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<CompetenciaDto> findByPeriodo(@PathVariable Long id) {
        CompetenciaDto p=competenciaMapper.toDTO(competenciaService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody CompetenciaDto competenciaDto) {
        competenciaService.save(competenciaMapper.toEntity(competenciaDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        competenciaService.delete(id);
    }


}
