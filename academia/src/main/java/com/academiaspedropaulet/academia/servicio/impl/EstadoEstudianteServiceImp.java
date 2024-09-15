package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.EstadoEstudiante;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.EstadoEstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class EstadoEstudianteServiceImp extends CrudGenericoServiceImp<EstadoEstudiante,Long> implements EstadoEstudianteService {

    @Override
    protected CrudGenericoRepository<EstadoEstudiante, Long> getRepo() {
        return null;
    }
}
