package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.SeccionDto;
import com.academiaspedropaulet.academia.modelo.Seccion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SeccionMapper extends GenericMapper<SeccionDto, Seccion> {
}
