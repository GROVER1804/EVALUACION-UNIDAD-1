package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.CupoDto;
import com.academiaspedropaulet.academia.modelo.Cupo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CupoMapper extends GenericMapper<CupoDto, Cupo> {
}
