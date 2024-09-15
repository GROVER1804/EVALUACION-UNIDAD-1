package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.AsuntoDto;
import com.academiaspedropaulet.academia.modelo.Asunto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AsuntoMapper extends GenericMapper<AsuntoDto, Asunto> {
}
