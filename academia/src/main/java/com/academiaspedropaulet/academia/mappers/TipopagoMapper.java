package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.TipopagoDto;
import com.academiaspedropaulet.academia.modelo.Tipopago;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipopagoMapper extends GenericMapper<TipopagoDto, Tipopago> {
}
