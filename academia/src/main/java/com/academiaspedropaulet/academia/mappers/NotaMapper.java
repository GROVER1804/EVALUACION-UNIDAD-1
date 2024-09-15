package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.NotaDto;
import com.academiaspedropaulet.academia.modelo.Nota;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotaMapper extends GenericMapper<NotaDto, Nota> {
}
