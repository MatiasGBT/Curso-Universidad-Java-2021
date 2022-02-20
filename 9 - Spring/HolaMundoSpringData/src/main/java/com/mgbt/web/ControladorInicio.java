package com.mgbt.web;

import com.mgbt.dao.IPersonaDao;
import com.mgbt.domain.Persona;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller //Ahora es un controlador MVC, no uno Rest
@Slf4j //Nos da acceso a la variable log
public class ControladorInicio {
    
    @Autowired //Con esto inyectamos en Spring
    private IPersonaDao personaDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaDao.findAll();
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}