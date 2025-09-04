package com.prueba.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.prueba.demo.Service.MiembroService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;


@RestController
@RequestMapping("/miembros")
@Tag(name = "Miembros", description = "Operaciones relacionadas con miembros")

public class MiembroController {

    @Autowired
    MiembroService miembroService;

    public MiembroController(MiembroService miembroService) {
        this.miembroService = miembroService;
    }


    @GetMapping("/listar")
    @Operation(summary = "Listar miembros", description = "Obtiene la lista de todos los miembros")
    public List<String> listarMiembros() {
        return miembroService.obtenerMiembros();
    }


    @PostMapping("/crear")
    @Operation(summary = "Crear miembro", description = "Crea un nuevo miembro con identificación y nombre")
    public String crearMiembro(@RequestParam Integer identificacion, @RequestParam  String nombre) {
        return miembroService.crearMiembro(identificacion, nombre);
    }

    @PostMapping("/login")
    @Operation(summary = "Login de miembro", description = "Autentica un miembro por usuario y contraseña")
    public String login(@RequestParam String usuario, @RequestParam String password) {
        return miembroService.autenticar(usuario, password);
    }
}
