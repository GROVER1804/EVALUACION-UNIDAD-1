package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Asunto;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.AsuntoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class AsuntoServiceImp extends CrudGenericoServiceImp<Asunto,Long> implements AsuntoService {


    @Override
    protected CrudGenericoRepository<Asunto, Long> getRepo() {
        return null;
    }
}
