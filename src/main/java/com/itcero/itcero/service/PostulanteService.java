package com.itcero.itcero.service;

import com.itcero.itcero.interfaceService.IpostulanteService;
import com.itcero.itcero.interfaces.IPostulante;
import com.itcero.itcero.modelo.Postulante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostulanteService implements IpostulanteService {

    @Autowired
    private IPostulante data;

    @Override
    public List<Postulante> listar() {
        return (List<Postulante>)data.findAll();
    }

    @Override
    public Optional<Postulante> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Postulante p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
