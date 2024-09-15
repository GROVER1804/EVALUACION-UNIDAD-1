package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.PeriodoDto;
import com.academiaspedropaulet.academia.modelo.Periodo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PeriodoMapper extends GenericMapper<PeriodoDto, Periodo> {
}
