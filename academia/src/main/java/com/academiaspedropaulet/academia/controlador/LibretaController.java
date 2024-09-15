package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.LibretaDto;
import com.academiaspedropaulet.academia.mappers.LibretaMapper;
import com.academiaspedropaulet.academia.modelo.Libreta;
import com.academiaspedropaulet.academia.modelo.Libreta;
import com.academiaspedropaulet.academia.servicio.LibretaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/libreta")
public class LibretaController {
    private final LibretaService libretaService;
    private final LibretaMapper libretaMapper;

    @GetMapping("/list")
    public ResponseEntity<List<LibretaDto>> findAll() {
        List<LibretaDto> p=libretaMapper.toDTOs(libretaService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<LibretaDto> findByPeriodo(@PathVariable Long id) {
        LibretaDto p=libretaMapper.toDTO(libretaService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody LibretaDto libretaDto) {
        libretaService.save(libretaMapper.toEntity(libretaDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        libretaService.delete(id);
    }
}
