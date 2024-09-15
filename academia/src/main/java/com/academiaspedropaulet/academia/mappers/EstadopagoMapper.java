package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.EstadopagoDto;
import com.academiaspedropaulet.academia.modelo.Estadopago;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstadopagoMapper extends GenericMapper<EstadopagoDto, Estadopago> {
}
