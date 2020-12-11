package com.kcs.controllers;

import com.kcs.services.TerminoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TerminoController {

    @Autowired
    private TerminoService terminoService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("lst-termes")
    public String listTerminos(Model model) {
        model.addAttribute("terminos", terminoService.findAll());
        return "views/lst-termes";
    }

    @GetMapping("show-terme")
    public String showTerme(@RequestParam String terme, Model model) {
        model.addAttribute("terminos", terminoService.findByTerme(terme));
        return "views/show-terme";
    }
    
}
