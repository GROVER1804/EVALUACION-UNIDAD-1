package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LibretaDto {
    private Long id;
    private CompetenciaDto competenciaDtoId;

    private EstudianteDto estudianteDtoId;
}
