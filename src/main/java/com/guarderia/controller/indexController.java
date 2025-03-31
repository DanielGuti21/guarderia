package com.guarderia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author XSF
 */
@Controller
public class indexController {
    
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("attribute", "value");
        return "index";
    }
    
}
