package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AsuntoDto {
    private Long id;

    private String nombre;

    private int monto;
}
