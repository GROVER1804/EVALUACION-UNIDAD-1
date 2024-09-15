package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Institucion;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.InstitucionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class InstitucionServiceImp  extends CrudGenericoServiceImp<Institucion,Long> implements InstitucionService {

    @Override
    protected CrudGenericoRepository<Institucion, Long> getRepo() {
        return null;
    }
}