package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Estadoasistencia;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.EstadoasistenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class EstadoasistenciaServiceImp extends CrudGenericoServiceImp<Estadoasistencia,Long> implements EstadoasistenciaService {

    @Override
    protected CrudGenericoRepository<Estadoasistencia, Long> getRepo() {
        return null;
    }
}


