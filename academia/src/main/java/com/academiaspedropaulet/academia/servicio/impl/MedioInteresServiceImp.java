package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.MedioInteres;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.MedioInteresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class MedioInteresServiceImp extends CrudGenericoServiceImp<MedioInteres,Long> implements MedioInteresService {

    @Override
    protected CrudGenericoRepository<MedioInteres, Long> getRepo() {
        return null;
    }
}