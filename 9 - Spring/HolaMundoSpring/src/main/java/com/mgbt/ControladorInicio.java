package com.mgbt;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Para que Spring reconozca la clase
@Slf4j //Nos da acceso a la variable log
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio() {
        log.info("ejecutando el controlador rest");
        log.debug("más detalles del controlador");
        return "HolaMundo con Spring";
    }
}
