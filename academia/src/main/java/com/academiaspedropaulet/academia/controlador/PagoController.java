package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.PagoDto;
import com.academiaspedropaulet.academia.mappers.PagoMapper;
import com.academiaspedropaulet.academia.modelo.Pago;
import com.academiaspedropaulet.academia.modelo.Pago;
import com.academiaspedropaulet.academia.servicio.PagoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/pago")
public class PagoController {
    private final PagoService pagoService;
    private final PagoMapper pagoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<PagoDto>> findAll() {
        List<PagoDto> p=pagoMapper.toDTOs(pagoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<PagoDto> findByPeriodo(@PathVariable Long id) {
        PagoDto p=pagoMapper.toDTO(pagoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody PagoDto pagoDto) {
        pagoService.save(pagoMapper.toEntity(pagoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        pagoService.delete(id);
    }
    
}
