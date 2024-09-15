package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.CargoDto;
import com.academiaspedropaulet.academia.modelo.Cargo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CargoMapper extends GenericMapper<CargoDto, Cargo> {
}
