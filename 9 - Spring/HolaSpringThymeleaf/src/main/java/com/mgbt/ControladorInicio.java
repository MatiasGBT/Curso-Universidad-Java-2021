package com.mgbt;

import com.mgbt.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller //Ahora es un controlador MVC, no uno Rest
@Slf4j //Nos da acceso a la variable log
public class ControladorInicio {
    
    //Para acceder al mensaje de saludos (en application.properties) desde el Controlador se debe agregar su valor
    //en una variable
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ejecutando el controlador Spring MVC");
        
        var mensaje = "Mensaje con Thymeleaf";
        
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Peréz");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("55443322");
        
        var persona2 = new Persona();
        persona2.setNombre("Carla");
        persona2.setApellido("Gomez");
        persona2.setEmail("cgomez@mail.com");
        persona2.setTelefono("22334455");
        
        //var personas = new ArrayList<>();
        //personas.add(persona);
        //personas.add(persona2);
        var personas = Arrays.asList(persona, persona2);
        
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        
        return "index"; //Por default thymeleaf utiliza archivos html
    }
    /*
    Model sirve para agregar la información que queremos compartir con la Vista, reemplazando el objeto
    request y el objeto response (que se pueden seguir utilizando).
    Cuando trabajamos con Spring se aplica el concepto de inyección de dependencias, así que debido
    a que utilizamos la anotación Controller, nuestra clase ya esta disponible en la fabrica de Spring
    por lo que dentro de los métodos de tipo Mapping (GetMapping, etc) podemos recibir diferentes argumentos
    simplemente declarandolos (como es el ejemplo del parámetro Model model del método inicio)
    */
}

/*
Gracias a la anotación de Controller, aunque trabajemos con la tecnología de los Servlets por detrás,
ya no es necesario extender desde ninguna clase (HttpServlet).
Lo que se ejecuta por detrás es la tecnología de los Servlets, por lo que es importante
tener las bases de esta API para saber que sucede.
*/