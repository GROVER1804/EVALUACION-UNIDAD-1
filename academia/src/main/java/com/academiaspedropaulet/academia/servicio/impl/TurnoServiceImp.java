package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Turno;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.TurnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class TurnoServiceImp extends CrudGenericoServiceImp<Turno,Long> implements TurnoService {

    @Override
    protected CrudGenericoRepository<Turno, Long> getRepo() {
        return null;
    }
}