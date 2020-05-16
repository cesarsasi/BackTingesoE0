package com.itcero.itcero.interfaces;

import com.itcero.itcero.modelo.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarrera extends JpaRepository<Carrera,Integer> {
}
