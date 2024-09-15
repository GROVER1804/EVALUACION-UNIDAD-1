package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AsistenciacursoDto {
    private Long id;

    private Date fechaAsistencia;


    private EstadoasistenciaDto estadoasistenciaDtoId;


    private CursoDto cursoDtoId;


    private PeriodoDto periodoDtoId;


    private EstudianteDto estudianteDtoId;
}
