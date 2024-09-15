package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NotaDto {
    private Long id;

    private int nota;

    private CompetenciaDto competenciaDtoId;
}
