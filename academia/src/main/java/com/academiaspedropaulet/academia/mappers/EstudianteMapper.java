package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.EstudianteDto;
import com.academiaspedropaulet.academia.modelo.Estudiante;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstudianteMapper extends GenericMapper<EstudianteDto, Estudiante> {
}
