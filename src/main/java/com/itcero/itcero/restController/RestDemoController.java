package com.itcero.itcero.restController;

import com.itcero.itcero.interfaces.ICarrera;
import com.itcero.itcero.interfaces.IPostulante;
import com.itcero.itcero.modelo.Carrera;
import com.itcero.itcero.modelo.Postulante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/postulantes")
public class RestDemoController {

    @Autowired
    private IPostulante repo;
    @GetMapping
    public List<Postulante> listar(){
        return repo.findAll();
    }
    @PostMapping
    public void insertar(Postulante postulante){
        repo.save(postulante);
    }




}
