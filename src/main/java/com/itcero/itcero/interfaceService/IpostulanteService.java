package com.itcero.itcero.interfaceService;
import com.itcero.itcero.modelo.Postulante;

import java.util.List;
import java.util.Optional;

public interface IpostulanteService {
    public List<Postulante>listar();
    public Optional<Postulante>listarId(int id);
    public int save(Postulante p);
    public void delete(int id);
}
