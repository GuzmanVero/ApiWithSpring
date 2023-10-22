package com.unicaes.TheBBQPlace;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.processing.Generated;

@RestController
@RequestMapping("/saludar")
public class Controler {
    @GetMapping("/hola")
    public String saludar(){
        return "eso es una prueba";
    }
}
