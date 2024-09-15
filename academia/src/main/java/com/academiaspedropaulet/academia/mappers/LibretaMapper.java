package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.LibretaDto;
import com.academiaspedropaulet.academia.modelo.Libreta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LibretaMapper extends GenericMapper<LibretaDto, Libreta> {
}
