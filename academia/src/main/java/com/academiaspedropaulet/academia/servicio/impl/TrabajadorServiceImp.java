package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Trabajador;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.TrabajadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class TrabajadorServiceImp extends CrudGenericoServiceImp<Trabajador,Long> implements TrabajadorService {

    @Override
    protected CrudGenericoRepository<Trabajador, Long> getRepo() {
        return null;
    }
}