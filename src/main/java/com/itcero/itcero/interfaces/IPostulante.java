package com.itcero.itcero.interfaces;

import com.itcero.itcero.modelo.Postulante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostulante extends CrudRepository <Postulante,Integer>{
}
