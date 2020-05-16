package com.itcero.itcero.restController;

import com.itcero.itcero.interfaces.ICarrera;
import com.itcero.itcero.modelo.Carrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carrera")
public class RestCarrController {
    @Autowired
    private ICarrera repoc;
    @GetMapping
    public List<Carrera> listar(){
        return repoc.findAll();
    }
    @PostMapping
    public void insertar(Carrera carrera){
        repoc.save(carrera);
    }
}
