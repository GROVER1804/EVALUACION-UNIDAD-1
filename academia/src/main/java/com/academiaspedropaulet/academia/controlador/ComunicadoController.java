package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.ComunicadoDto;
import com.academiaspedropaulet.academia.mappers.ComunicadoMapper;
import com.academiaspedropaulet.academia.modelo.Comunicado;
import com.academiaspedropaulet.academia.modelo.Comunicado;
import com.academiaspedropaulet.academia.servicio.ComunicadoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/comunicado")
public class ComunicadoController {
    private final ComunicadoService comunicadoService;
    private final ComunicadoMapper comunicadoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<ComunicadoDto>> findAll() {
        List<ComunicadoDto> p=comunicadoMapper.toDTOs(comunicadoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<ComunicadoDto> findByPeriodo(@PathVariable Long id) {
        ComunicadoDto p=comunicadoMapper.toDTO(comunicadoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody ComunicadoDto comunicadoDto) {
        comunicadoService.save(comunicadoMapper.toEntity(comunicadoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        comunicadoService.delete(id);
    }
}
