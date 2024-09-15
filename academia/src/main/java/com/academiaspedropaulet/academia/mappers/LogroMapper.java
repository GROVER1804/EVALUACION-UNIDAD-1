package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.LogroDto;
import com.academiaspedropaulet.academia.modelo.Logro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LogroMapper extends GenericMapper<LogroDto, Logro> {
}
