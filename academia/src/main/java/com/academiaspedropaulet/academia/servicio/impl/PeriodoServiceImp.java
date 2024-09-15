package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Periodo;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.PeriodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class PeriodoServiceImp extends CrudGenericoServiceImp<Periodo,Long> implements PeriodoService {

    @Override
    protected CrudGenericoRepository<Periodo, Long> getRepo() {
        return null;
    }
}