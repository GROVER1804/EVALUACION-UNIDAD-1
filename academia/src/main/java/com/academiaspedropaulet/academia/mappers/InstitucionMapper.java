package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.InstitucionDto;
import com.academiaspedropaulet.academia.modelo.Institucion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InstitucionMapper extends GenericMapper<InstitucionDto, Institucion> {
}
