package com.guarderia.controller;

import com.guarderia.domain.Matricula;
import com.guarderia.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    @GetMapping("/Matricula")
    public String mostrarFormulario() {
        return "Matricula"; 
    }

    // Método POST para guardar la matrícula
    @PostMapping("/Matricula")
    public String guardarMatricula(Matricula matricula) {
        matriculaService.save(matricula);  
        return "redirect:/";  
    }
}

