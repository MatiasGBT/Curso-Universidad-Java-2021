package com.mgbt.web;

import com.mgbt.service.IPersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller //Ahora es un controlador MVC, no uno Rest
@Slf4j //Nos da acceso a la variable log
public class ControladorInicio {
    
    @Autowired //Con esto inyectamos en Spring
    private IPersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaService.listarPersonas();
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}