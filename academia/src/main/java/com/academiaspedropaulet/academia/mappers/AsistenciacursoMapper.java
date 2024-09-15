package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.AsistenciacursoDto;
import com.academiaspedropaulet.academia.modelo.Asistenciacurso;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AsistenciacursoMapper extends GenericMapper<AsistenciacursoDto, Asistenciacurso> {
}
