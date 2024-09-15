package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompetenciaDto {
    private Long id;

    private int promedio;

    private Date fechaInicio;

    private Date fechaFin;

    private int nombreCompetencia;

    private CursoDto cursoDtoId;
}
