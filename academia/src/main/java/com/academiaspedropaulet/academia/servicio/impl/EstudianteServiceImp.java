package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Estudiante;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class EstudianteServiceImp extends CrudGenericoServiceImp<Estudiante,Long> implements EstudianteService {

    @Override
    protected CrudGenericoRepository<Estudiante, Long> getRepo() {
        return null;
    }
}