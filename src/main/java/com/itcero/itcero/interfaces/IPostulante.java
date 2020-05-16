package com.itcero.itcero.interfaces;

import com.itcero.itcero.modelo.Postulante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostulante extends JpaRepository<Postulante,Integer> {

}
