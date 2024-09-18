/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.proyecto1.proyecto1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author julio
 */
@RestController//cambiamos a Controller
public class MiRestController {
    
    @GetMapping("/") 
    public String saludo(){
        
        return "index";
        
    }
    
    @GetMapping("/info") 
    public String informacion(){
        
        return "Esta es la web de los mejores programadores del mundo";
        
    }
    
    
    
}
