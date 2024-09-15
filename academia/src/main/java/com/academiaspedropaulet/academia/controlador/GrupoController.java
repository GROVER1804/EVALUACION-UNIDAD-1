package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.GrupoDto;
import com.academiaspedropaulet.academia.mappers.GrupoMapper;
import com.academiaspedropaulet.academia.modelo.Grupo;
import com.academiaspedropaulet.academia.modelo.Grupo;
import com.academiaspedropaulet.academia.servicio.GrupoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/grupo")
public class GrupoController {
    private final GrupoService grupoService;
    private final GrupoMapper grupoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<GrupoDto>> findAll() {
        List<GrupoDto> p=grupoMapper.toDTOs(grupoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<GrupoDto> findByPeriodo(@PathVariable Long id) {
        GrupoDto p=grupoMapper.toDTO(grupoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody GrupoDto grupoDto) {
        grupoService.save(grupoMapper.toEntity(grupoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        grupoService.delete(id);
    }
}
