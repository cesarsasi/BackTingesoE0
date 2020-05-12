package com.itcero.itcero.controler;

import com.itcero.itcero.interfaceService.IpostulanteService;
import com.itcero.itcero.modelo.Postulante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IpostulanteService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Postulante> postulantes = service.listar();
        model.addAttribute("postulantes",postulantes);
        return "index";

    }
}
