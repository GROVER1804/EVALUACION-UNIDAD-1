package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Comunicado;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.ComunicadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class ComunicadoServiceImp extends CrudGenericoServiceImp<Comunicado,Long> implements ComunicadoService {


    @Override
    protected CrudGenericoRepository<Comunicado, Long> getRepo() {
        return null;
    }
}
