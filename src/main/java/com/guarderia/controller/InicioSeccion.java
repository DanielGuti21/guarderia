/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guarderia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


 @Controller
public class InicioSeccion {
@RequestMapping("/Inicioseccion")
    public String Inicioseccion(Model model) {
        model.addAttribute("attribute", "value");
        return "Inicioseccion";
    }
    
}   

