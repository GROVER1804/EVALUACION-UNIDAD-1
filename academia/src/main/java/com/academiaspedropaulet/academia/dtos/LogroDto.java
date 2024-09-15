package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LogroDto {
    private Long id;

    private String titulo;

    private String descripcion;

    private Date fecha;

    // Indica que es un objeto de gran tamaño para imagenes
    private byte[] imagen;

    private InstitucionDto institucionDtoId;
}
