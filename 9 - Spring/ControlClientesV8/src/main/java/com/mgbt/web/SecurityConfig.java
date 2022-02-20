package com.mgbt.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration //Es una clase de configuracion de Spring
@EnableWebSecurity //Activar la seguridad web
public class SecurityConfig extends WebSecurityConfigurerAdapter { //La clase debe extender de la clase WebSecurityConfigurerAdapter
    
    //Vamos a agregar 2 métodos, el de configure, el cual recibe un objeto del tipo AuthenticationManagerBuilder
    //y permite crear y personalizar usuarios para hacer login en la aplicación, y el método configure (se llaman igual)
    //que recibe un parametro de HttpSecurity, para poder restringir las URL de la aplicación web.

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                    .withUser("admin")
                    .password("{noop}123")
                    .roles("ADMIN", "USER")
                .and()
                    .withUser("user")
                    .password("{noop}123")
                    .roles("USER")
                ;
        //Para trabajar con passwords hay que encriptarlos, sin embargo, utilizando
        //{noop} ya no es necesario. Posteriormente veremos como hacerlo encriptado.
        
        //Esto es AUTENTICACIÓN, en esta el usuario presenta sus credenciales (usuario y password).
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.authorizeRequests()
              .antMatchers("/editar/**", "/agregar/**", "/eliminar/**")
              .hasRole("ADMIN")
              .antMatchers("/") //El path estandar puede ser visto por cualquier rol
              .hasAnyRole("USER", "ADMIN")
              .and()
              .formLogin()
              .loginPage("/login")
              .and()
              .exceptionHandling().accessDeniedPage("/errores/403");
      //Solo los usuarios con rol ADMIN podran entrar al path de editar, agregar y eliminar.
      //** significa todos sus URL hijas, como por ejemplo http://localhost:8080/editar/5
      
      //Esto es AUTORIZACIÓN, permitimos a usuarios con ciertos roles visualizar una página, ejecutar una acción, etc.
    }
}
