package com.academiaspedropaulet.academia.servicio.impl;

import com.academiaspedropaulet.academia.modelo.Cargo;
import com.academiaspedropaulet.academia.repositorio.CargoRepository;
import com.academiaspedropaulet.academia.repositorio.CrudGenericoRepository;
import com.academiaspedropaulet.academia.servicio.CargoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class CargoServiceImp extends CrudGenericoServiceImp<Cargo,Long> implements CargoService {


    @Autowired
    private CrudGenericoRepository<Cargo, Long> cargoRepository;

    @Override
    protected CrudGenericoRepository<Cargo, Long> getRepo() {
        return cargoRepository;

    }
}
