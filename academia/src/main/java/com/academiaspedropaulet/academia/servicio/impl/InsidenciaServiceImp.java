package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Insidencia;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.InsidenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class InsidenciaServiceImp extends CrudGenericoServiceImp<Insidencia,Long> implements InsidenciaService{

    @Override
    protected CrudGenericoRepository<Insidencia, Long> getRepo() {
        return null;
    }
}