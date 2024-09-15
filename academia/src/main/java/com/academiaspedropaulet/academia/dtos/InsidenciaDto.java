package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InsidenciaDto {
    private Long id;
    private String descripcion;

    private String castigo;

    private Date fechaRegistro;

    private CursoDto cursoDtoId;

    private EstudianteDto estudianteDtoId;
}
