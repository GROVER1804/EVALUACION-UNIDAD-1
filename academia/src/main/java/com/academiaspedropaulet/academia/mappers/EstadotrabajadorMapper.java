package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.EstadotrabajadorDto;
import com.academiaspedropaulet.academia.modelo.Estadotrabajador;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstadotrabajadorMapper extends GenericMapper<EstadotrabajadorDto, Estadotrabajador> {
}
