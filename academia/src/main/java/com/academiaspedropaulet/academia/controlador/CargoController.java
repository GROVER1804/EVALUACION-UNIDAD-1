package com.academiaspedropaulet.academia.controlador;

import com.academiaspedropaulet.academia.dtos.CargoDto;
import com.academiaspedropaulet.academia.mappers.CargoMapper;
import com.academiaspedropaulet.academia.modelo.Cargo;
import com.academiaspedropaulet.academia.servicio.CargoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/cargo")
public class CargoController {
    private final CargoService cargoService;
    private final CargoMapper cargoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<CargoDto>> findAll() {
        List<CargoDto> p=cargoMapper.toDTOs(cargoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<CargoDto> findByCargo(@PathVariable Long id) {
        CargoDto p=cargoMapper.toDTO(cargoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody CargoDto cargoDto) {
        cargoService.save(cargoMapper.toEntity(cargoDto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        cargoService.delete(id);
    }
}



/*
    Otros metodos de Guardado
    public ResponseEntity<Cargo> guardar(@RequestBody Cargo cargo) {
        Cargo data = cargoService.guardarCargo(cargo
        cargoService.guardarCargo(cargo);


     public void guardar(@RequestBody Cargo cargo) {
        cargoService.guardarCargo(cargo);
    }
     */
