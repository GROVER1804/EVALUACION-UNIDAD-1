package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Competencia;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.CompetenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class CompetenciaServiceImp extends CrudGenericoServiceImp<Competencia,Long> implements CompetenciaService {


    @Override
    protected CrudGenericoRepository<Competencia, Long> getRepo() {
        return null;
    }
}
