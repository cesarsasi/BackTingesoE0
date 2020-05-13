package com.itcero.itcero.interfaces;

import com.itcero.itcero.modelo.Carrera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarrera extends CrudRepository<Carrera,Integer> {
}
