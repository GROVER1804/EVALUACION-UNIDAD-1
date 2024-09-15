package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TurnoDto {
    private Long id;

    private String nombreTurno;

    private Date horaInicio;

    private Date horaFin;
}
