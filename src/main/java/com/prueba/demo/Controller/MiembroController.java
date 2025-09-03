package com.prueba.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.prueba.demo.Service.MiembroService;

import java.util.List;

@RestController
@RequestMapping("/miembros")

public class MiembroController {

    @Autowired
    MiembroService miembroService;

    public MiembroController(MiembroService miembroService) {
        this.miembroService = miembroService;
    }

    @GetMapping("/listar")
    public List<String> listarMiembros() {
        return miembroService.obtenerMiembros();
    }

    @PostMapping("/crear")
    public String crearMiembro(@RequestParam Integer identificacion, @RequestParam  String nombre) {
        return miembroService.crearMiembro(identificacion, nombre);
    }

    @PostMapping("/login")
    public String login(@RequestParam String usuario, @RequestParam String password) {
        return miembroService.autenticar(usuario, password);
    }
}
