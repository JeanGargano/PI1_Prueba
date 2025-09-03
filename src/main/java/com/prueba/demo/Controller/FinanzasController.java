package com.prueba.demo.Controller;

import com.prueba.demo.Service.FinanzasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/finanzas")
public class FinanzasController {

    @Autowired
    FinanzasService cuotaService;

    public FinanzasController(FinanzasService cuotaService) {
        this.cuotaService = cuotaService;
    }

    @PostMapping("/pagar")
    public String pagarCuota(@RequestParam Integer identificacion) {
        return cuotaService.pagarCuota(identificacion);
    }


    @PostMapping("/obtener")
    public String obtenerCuota(@RequestParam Integer identificacion) {
        return cuotaService.obtenerCuota(identificacion);
    }
}
