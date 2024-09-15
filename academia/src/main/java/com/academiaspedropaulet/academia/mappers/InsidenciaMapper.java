package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.InsidenciaDto;
import com.academiaspedropaulet.academia.modelo.Insidencia;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InsidenciaMapper extends GenericMapper<InsidenciaDto, Insidencia> {
}
