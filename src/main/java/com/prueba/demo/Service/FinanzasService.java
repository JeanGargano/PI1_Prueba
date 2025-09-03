package com.prueba.demo.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FinanzasService {

    private final Map<Integer, String> cuotas = new HashMap<>();

    public FinanzasService() {
        cuotas.put(123, "Pendiente");
        cuotas.put(456, "Pagada");
        cuotas.put(789, "Pendiente");
    }

    public String pagarCuota(Integer identificacion) {
        cuotas.put(identificacion, "Pagada");
        return "Cuota pagada por el miembro con ID " + identificacion;
    }

    public String obtenerCuota(Integer identificacion) {
        return "Estado de la cuota del miembro " + identificacion + ": " +
                cuotas.getOrDefault(identificacion, "No encontrado");
    }
}
