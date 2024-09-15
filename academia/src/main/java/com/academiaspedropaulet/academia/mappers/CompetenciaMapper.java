package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.CompetenciaDto;
import com.academiaspedropaulet.academia.modelo.Competencia;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompetenciaMapper extends GenericMapper<CompetenciaDto, Competencia> {
}
