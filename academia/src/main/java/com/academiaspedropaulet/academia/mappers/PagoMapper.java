package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.PagoDto;
import com.academiaspedropaulet.academia.modelo.Pago;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PagoMapper extends GenericMapper<PagoDto, Pago> {
}
