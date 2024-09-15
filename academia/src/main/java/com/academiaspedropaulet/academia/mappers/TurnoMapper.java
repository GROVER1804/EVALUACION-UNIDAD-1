package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.TurnoDto;
import com.academiaspedropaulet.academia.modelo.Turno;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TurnoMapper extends GenericMapper<TurnoDto, Turno> {
}
