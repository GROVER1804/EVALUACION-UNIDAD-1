package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Sedeinstitucion;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.SedeinstitucionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class SedeinstitucionServiceImp extends CrudGenericoServiceImp<Sedeinstitucion,Long> implements SedeinstitucionService {

    @Override
    protected CrudGenericoRepository<Sedeinstitucion, Long> getRepo() {
        return null;
    }
}