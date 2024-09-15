package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.EstadoasistenciaDto;
import com.academiaspedropaulet.academia.modelo.Estadoasistencia;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstadoasistenciaMapper  extends GenericMapper<EstadoasistenciaDto, Estadoasistencia> {
}
