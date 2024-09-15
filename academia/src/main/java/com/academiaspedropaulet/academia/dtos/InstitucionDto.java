package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InstitucionDto {
    private Long id;
    private byte[] imagenLogo;

    private String nombreInstitucion;

    private String Lugar;

    private String mision;

    private String vicion;

    private SedeinstitucionDto sedeinstitucionDtoId;
}
