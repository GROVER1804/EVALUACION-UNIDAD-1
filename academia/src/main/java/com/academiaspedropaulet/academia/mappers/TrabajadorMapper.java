package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.TrabajadorDto;
import com.academiaspedropaulet.academia.modelo.Trabajador;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TrabajadorMapper extends GenericMapper<TrabajadorDto, Trabajador> {
}
