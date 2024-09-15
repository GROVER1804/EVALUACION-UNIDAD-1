package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Tipopago;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.TipopagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class TipopagoServiceImp extends CrudGenericoServiceImp<Tipopago,Long> implements TipopagoService {

    @Override
    protected CrudGenericoRepository<Tipopago, Long> getRepo() {
        return null;
    }
}