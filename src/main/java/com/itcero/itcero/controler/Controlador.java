package com.itcero.itcero.controler;

import com.itcero.itcero.interfaceService.IcarreraService;
import com.itcero.itcero.interfaceService.IpostulanteService;
import com.itcero.itcero.modelo.Carrera;
import com.itcero.itcero.modelo.Postulante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping()
public class Controlador {
    @Autowired
    private IpostulanteService post;

    @Autowired
    private IcarreraService carr;

    @GetMapping("/listarC")
    public String listarC(Model modelc){
        List<Carrera> carreras = carr.listarC();
        modelc.addAttribute("carreras",carreras);
        return "indexc";
    }

    @GetMapping("/listar")
    public String listar(Model modelp){
        List<Postulante> postulantes = post.listar();
        modelp.addAttribute("postulantes",postulantes);
        return "index";
    }
}
