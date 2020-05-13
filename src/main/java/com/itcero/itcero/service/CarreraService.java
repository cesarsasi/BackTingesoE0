package com.itcero.itcero.service;

import com.itcero.itcero.interfaceService.IcarreraService;
import com.itcero.itcero.interfaces.ICarrera;
import com.itcero.itcero.interfaces.IPostulante;
import com.itcero.itcero.modelo.Carrera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarreraService implements IcarreraService {
    @Autowired
    private ICarrera data;

    @Override
    public List<Carrera> listarC() {
        return (List<Carrera>)data.findAll();
    }

    @Override
    public Optional<Carrera> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Carrera c) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
