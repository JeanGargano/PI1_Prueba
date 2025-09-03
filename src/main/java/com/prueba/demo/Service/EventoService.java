package com.prueba.demo.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

        public List<String> obtenerEventos() {
            return List.of("Reunión mensual", "Taller de liderazgo");
        }

}
