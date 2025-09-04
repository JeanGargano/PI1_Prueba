package com.prueba.demo.Controller;


import com.prueba.demo.Service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;

@RestController
@RequestMapping("/eventos")
@Tag(name = "Eventos", description = "Operaciones relacionadas con eventos")
public class EventoController {

    @Autowired
    EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping("listar")
    @Operation(summary = "Listar eventos", description = "Obtiene la lista de todos los eventos")
    public List<String> listarEventos() {
        return eventoService.obtenerEventos();
    }
}