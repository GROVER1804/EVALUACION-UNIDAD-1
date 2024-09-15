package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Grupo;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.GrupoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class GrupoServiceImp extends CrudGenericoServiceImp<Grupo,Long> implements GrupoService {

    @Override
    protected CrudGenericoRepository<Grupo, Long> getRepo() {
        return null;
    }
}