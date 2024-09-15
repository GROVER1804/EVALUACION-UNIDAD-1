package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Estadopago;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.EstadopagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class EstadopagoServiceImp extends CrudGenericoServiceImp<Estadopago,Long> implements EstadopagoService  {

    @Override
    protected CrudGenericoRepository<Estadopago, Long> getRepo() {
        return null;
    }
}