package com.prueba.demo.Controller;

import com.prueba.demo.Service.ProgresionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/progresion")
public class ProgresionController {

    @Autowired
    ProgresionService progresionService;

    public ProgresionController(ProgresionService progresionService) {
        this.progresionService = progresionService;
    }

    @GetMapping("/listar")
    public String verProgresion() {
        return progresionService.obtenerProgresion();
    }
}