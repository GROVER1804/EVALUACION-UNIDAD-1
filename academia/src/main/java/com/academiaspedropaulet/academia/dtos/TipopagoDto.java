package com.academiaspedropaulet.academia.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TipopagoDto {
    private Long id;
    private String nombreViaPago;
}
