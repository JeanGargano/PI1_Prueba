package com.prueba.demo.Controller;


import com.prueba.demo.Service.ProgresionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/progresion")
@Tag(name = "Progresion", description = "Operaciones relacionadas con progresión")
public class ProgresionController {

    @Autowired
    ProgresionService progresionService;

    public ProgresionController(ProgresionService progresionService) {
        this.progresionService = progresionService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Ver progresión", description = "Obtiene la progresión de los miembros")
    public String verProgresion() {
        return progresionService.obtenerProgresion();
    }
}