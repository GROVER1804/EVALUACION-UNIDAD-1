package com.academiaspedropaulet.academia.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ComunicadoDto {
    private Long id;

    private String asunto;

    private String descripcion;

    private Date fecha;

    private InstitucionDto institucionDtoId;
}
