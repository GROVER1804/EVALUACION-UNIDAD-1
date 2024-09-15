package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Estadotrabajador;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.EstadotrabajadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class EstadotrabajadorServiceImp extends CrudGenericoServiceImp<Estadotrabajador,Long> implements EstadotrabajadorService {

    @Override
    protected CrudGenericoRepository<Estadotrabajador, Long> getRepo() {
        return null;
    }
}