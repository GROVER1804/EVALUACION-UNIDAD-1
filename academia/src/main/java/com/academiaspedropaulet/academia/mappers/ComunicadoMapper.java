package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.ComunicadoDto;
import com.academiaspedropaulet.academia.modelo.Comunicado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComunicadoMapper extends GenericMapper<ComunicadoDto, Comunicado> {
}
