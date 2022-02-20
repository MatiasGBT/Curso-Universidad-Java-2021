package com.mgbt.web;

import com.mgbt.domain.Persona;
import com.mgbt.service.IPersonaService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
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

    @GetMapping("/agregar")
    public String agregar(Persona persona) {
        //Spring automaticamente crea un objeto persona al recibir un objeto como parametro
        //sin necesidad de utilizar el operador new
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errores) {
        //Con la etiqueta Valid preguntamos si el objeto persona es valido (cumple las validaciones)
        if (errores.hasErrors()) {
            return "modificar";
        } else {
            personaService.guardar(persona);
            return "redirect:/";
        }
    }

    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model) { //Spring automáticamente busca un objeto Persona existente con el parámetro incluído en el mapeo (idPersona)
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }

    @GetMapping("/eliminar/{idPersona}")
    public String eliminar(Persona persona) {
        personaService.eliminar(persona);
        return "redirect:/";
    }
}
