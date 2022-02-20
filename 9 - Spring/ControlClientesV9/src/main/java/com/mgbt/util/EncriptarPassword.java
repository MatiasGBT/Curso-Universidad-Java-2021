package com.mgbt.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//Esta es una clase de utilería para generar los password a utilizar en la BD
public class EncriptarPassword {
    public static void main(String[] args) {
        var password = "123";
        System.out.println("Password: " + password);
        System.out.println("Password encriptado: " + encriptarPassword(password));
    }
    
    public static String encriptarPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
