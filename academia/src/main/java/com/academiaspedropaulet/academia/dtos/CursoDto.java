package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CursoDto {
    private Long id;
    private String nombre;
    private TurnoDto turnoDtoId;

    private TrabajadorDto trabajadorDtoId;

    private GrupoDto grupoDtoId;

    private PeriodoDto periodoDtoId;

    private int promedioNotas;
}
