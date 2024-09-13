/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.proyecto1.proyecto1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author julio
 */
@RestController
public class MiRestController {
    
    @GetMapping("/")// El controlador Rest manejará las solicitudes desde esta ruta 
    public String saludo(){
        
        return "hola alumnos de Spring Boot";
        
    }
    
    
    
}
