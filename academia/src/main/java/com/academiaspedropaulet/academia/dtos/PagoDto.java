package com.academiaspedropaulet.academia.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PagoDto {
    private Long id;

    private Date fechaPago;

    private EstadopagoDto estadopagoDtoId;

    private TipopagoDto tipopagoDtoId;

    private PeriodoDto periodoDtoId;

    private EstudianteDto estudianteDtoId;

    private AsuntoDto asuntoDtoId;
}
