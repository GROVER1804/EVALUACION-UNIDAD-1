package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.GrupoDto;
import com.academiaspedropaulet.academia.modelo.Grupo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GrupoMapper extends GenericMapper<GrupoDto, Grupo> {
}
