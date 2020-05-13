package com.itcero.itcero.interfaceService;
import com.itcero.itcero.modelo.Carrera;


import java.util.List;
import java.util.Optional;

public interface IcarreraService {
    public List<Carrera> listarC();
    public Optional<Carrera> listarId(int id);
    public int save(Carrera c);
    public void delete(int id);
}
