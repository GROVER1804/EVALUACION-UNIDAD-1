package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EstudianteDto {
    private Long id;

    private String nombreCompleto;

    private String apellidoPaterno;

    private String apellidoMaterno;

    private String dni;

    private int celular;

    private String correo;

    private String contrasena;

    private EstadoEstudianteDto estadoEstudianteDtoId;

    private int edad;

    private Date fechaNac;

    private Date fechaIncorporacion;

    private String lugarNatural;

    private String IEqueEstudio;

    private String direccion;

    private String aQueEscuelaPostula;

    private String gradoInstruccion;

    private String familiarMilitarPolicial;

    private String natacion;

    private int peso;

    private int talla;

    private String otros;

    private String nombrePadre;

    private String ocupacionPadre;

    private String celularPadre;

    private String nombreMadre;

    private String ocupacionMadre;

    private String celularMadre;

    private String antePatoPsico;

    private String antePoliJudi;

    private String declaracionJurada;

    private MedioInteresDto medioInteresDtoId;
}
