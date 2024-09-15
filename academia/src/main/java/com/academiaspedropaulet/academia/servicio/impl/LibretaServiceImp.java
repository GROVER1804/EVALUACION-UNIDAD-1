package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Libreta;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.LibretaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class LibretaServiceImp  extends CrudGenericoServiceImp<Libreta,Long> implements LibretaService {

    @Override
    protected CrudGenericoRepository<Libreta, Long> getRepo() {
        return null;
    }
}