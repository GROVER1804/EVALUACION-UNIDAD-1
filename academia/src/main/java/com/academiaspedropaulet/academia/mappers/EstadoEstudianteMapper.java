package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.EstadoEstudianteDto;
import com.academiaspedropaulet.academia.modelo.EstadoEstudiante;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstadoEstudianteMapper extends GenericMapper<EstadoEstudianteDto, EstadoEstudiante>  {
}
