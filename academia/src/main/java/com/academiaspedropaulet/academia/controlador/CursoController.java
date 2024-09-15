package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.CursoDto;
import com.academiaspedropaulet.academia.mappers.CursoMapper;
import com.academiaspedropaulet.academia.modelo.Curso;
import com.academiaspedropaulet.academia.modelo.Curso;
import com.academiaspedropaulet.academia.servicio.CursoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/curso")
public class CursoController {
    private final CursoService cursoService;
    private final CursoMapper cursoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<CursoDto>> findAll() {
        List<CursoDto> p=cursoMapper.toDTOs(cursoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<CursoDto> findByPeriodo(@PathVariable Long id) {
        CursoDto p=cursoMapper.toDTO(cursoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody CursoDto cursoDto) {
        cursoService.save(cursoMapper.toEntity(cursoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        cursoService.delete(id);
    }
}
