/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.guarderia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author karol
 */
@Controller
public class MetodoDePago {
    
    @RequestMapping("/metodoDePago")
    public String MetodoDePago(Model model) {
        model.addAttribute("attribute", "value");
        return "metodoDePago";
    }
    
}
