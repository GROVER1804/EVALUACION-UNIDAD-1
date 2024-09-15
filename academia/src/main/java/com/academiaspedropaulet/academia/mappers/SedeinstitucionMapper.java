package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.SedeinstitucionDto;
import com.academiaspedropaulet.academia.modelo.Sedeinstitucion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SedeinstitucionMapper extends GenericMapper<SedeinstitucionDto, Sedeinstitucion> {
}
