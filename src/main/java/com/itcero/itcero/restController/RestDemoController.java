package com.itcero.itcero.restController;

import com.itcero.itcero.interfaces.IPostulante;
import com.itcero.itcero.modelo.Postulante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/postulantes")
public class RestDemoController {

    @Autowired
    private IPostulante repo;
    @GetMapping
    public List<Postulante> listar(){
        return repo.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody Postulante postulante){
        repo.save(postulante);
    }




}
