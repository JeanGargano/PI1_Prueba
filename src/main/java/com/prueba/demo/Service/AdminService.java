package com.prueba.demo.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    private final List<String> miembros = new ArrayList<>();
    private final List<String> eventos = new ArrayList<>();
    private final List<String> cuotas = new ArrayList<>();
    private final List<String> progresiones = new ArrayList<>();

    public AdminService() {
        miembros.add("Juan Pérez");
        miembros.add("Ana Gómez");

        eventos.add("Evento de bienvenida");
        eventos.add("Taller de liderazgo");

        cuotas.add("Cuota Enero - $50");
        cuotas.add("Cuota Febrero - $60");

        progresiones.add("Juan Pérez - Cinturón Azul");
        progresiones.add("Ana Gómez - Cinturón Verde");
    }

    // ===== Miembros =====
    public List<String> obtenerMiembros() {
        return miembros;
    }

    // ===== Eventos =====
    public List<String> obtenerEventos() {
        return eventos;
    }

    // ===== Cuotas =====
    public List<String> obtenerCuotas() {
        return cuotas;
    }

    // ===== Progresiones =====
    public List<String> obtenerProgresiones() {
        return progresiones;
    }
}
