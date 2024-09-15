package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.TipopagoDto;
import com.academiaspedropaulet.academia.mappers.TipopagoMapper;
import com.academiaspedropaulet.academia.modelo.Tipopago;
import com.academiaspedropaulet.academia.modelo.Tipopago;
import com.academiaspedropaulet.academia.servicio.TipopagoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/tipopago")
public class TipopagoController {
    private final TipopagoService tipopagoService;
    private final TipopagoMapper tipopagoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<TipopagoDto>> findAll() {
        List<TipopagoDto> p=tipopagoMapper.toDTOs(tipopagoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<TipopagoDto> findByPeriodo(@PathVariable Long id) {
        TipopagoDto p=tipopagoMapper.toDTO(tipopagoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody TipopagoDto tipopagoDto) {
        tipopagoService.save(tipopagoMapper.toEntity(tipopagoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        tipopagoService.delete(id);
    }
}
