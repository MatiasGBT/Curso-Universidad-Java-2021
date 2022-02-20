package com.mgbt.web;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

//Esta clase es un listener, es necesaria para implementar internacionalización (i18n)
@Configuration //Esta clase debe ser un Bean de configuración
public class WebConfig implements WebMvcConfigurer {
    
    //Vamos a definir un método que va a crear una instancia del objeto que nos interesa y, al haber agregado la
    //anotación @Bean, va a agregar este objeto al contenedor de Spring
    @Bean
    public LocaleResolver localeResolver() {
        var slr = new SessionLocaleResolver();
        slr.setDefaultLocale(new Locale("es"));
        return slr;
    }
    
    //Ahora hay que configurar un interceptor para poder cambiar de idioma de manera dinámica
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        var lci = new LocaleChangeInterceptor();
        lci.setParamName("lang"); //Cuando adjuntemos el parametro lang en las URL, podremos indicar cual es el lenguaje a utilizar
        return lci;
    }
    
    //Por último registramos este interceptor
    @Override
    public void addInterceptors(InterceptorRegistry registro) {
        registro.addInterceptor(localeChangeInterceptor());
    }
}
