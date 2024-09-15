package com.academiaspedropaulet.academia.mappers;

import com.academiaspedropaulet.academia.dtos.CursoDto;
import com.academiaspedropaulet.academia.modelo.Curso;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CursoMapper extends GenericMapper<CursoDto, Curso> {
}
