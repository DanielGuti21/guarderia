package com.guarderia.controller; // o el paquete donde tengas tus controladores

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

  
    @GetMapping("/inicioseccion")
    public String mostrarFormulario() {
        return "InicioSeccion"; // Nombre del HTML
    }

   
    @PostMapping("/login")
    public String procesarLogin(@RequestParam String usuario,
                                 @RequestParam String contrasena,
                                 RedirectAttributes redirectAttributes) {
        if ("admin".equals(usuario) && "1234".equals(contrasena)) {
            redirectAttributes.addFlashAttribute("exito", "¡Bienvenido, " + usuario + "!");
            return "redirect:/"; // redirige al index.html (inicio)
        } else {
            redirectAttributes.addFlashAttribute("error", "Usuario o contraseña incorrectos");
            return "redirect:/inicioseccion";
        }
    }
}

