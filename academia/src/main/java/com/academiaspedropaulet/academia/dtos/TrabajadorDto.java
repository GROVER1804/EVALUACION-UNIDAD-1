package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TrabajadorDto {
    private Long id;

    private String nombreCompleto;

    private String apellidoPaterno;

    private String apellidoMaterno;

    private String dni;

    private String correo;

    private String contrasena;

    private CargoDto cargoDtoId;

    private InstitucionDto institucionDtoId;

    private EstadotrabajadorDto estadotrabajadorDtoId;

    private String entregoCV;

    private int celular;
}
