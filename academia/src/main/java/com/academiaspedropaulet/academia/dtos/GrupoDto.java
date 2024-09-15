package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GrupoDto {
    private Long id;

    private String nombre;

    private SeccionDto seccionDtoId;

    private CupoDto cupoDtoId;
}
