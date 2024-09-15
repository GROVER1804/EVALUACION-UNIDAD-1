package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Asistenciacurso;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.AsistenciacursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Service
@Transactional
@RequiredArgsConstructor
public class AsistenciacursoServiceImp extends CrudGenericoServiceImp<Asistenciacurso,Long> implements AsistenciacursoService  {


    @Override
    protected CrudGenericoRepository<Asistenciacurso, Long> getRepo() {
        return null;
    }
}
