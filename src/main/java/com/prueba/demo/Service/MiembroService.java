package com.prueba.demo.Service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MiembroService {

    private final List<String> miembros = new ArrayList<>();

    public MiembroService() {
        miembros.add("Juan Pérez");
        miembros.add("Ana Gómez");
    }

    public List<String> obtenerMiembros() {
        return miembros;
    }

    public String crearMiembro(Integer identificacion, String name) {
        return "Se ha creado el miembro con identiifacion" + identificacion + " y su nombre: " + name ;
    }
    public String autenticar(String usuario, String password) {
        if ("admin".equals(usuario) && "1234".equals(password)) {
            return "287349873284727932342sdfs";
        }
        return "Credenciales inválidas";
    }
}
