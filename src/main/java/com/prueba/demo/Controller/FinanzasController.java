package com.prueba.demo.Controller;


import com.prueba.demo.Service.FinanzasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/finanzas")
@Tag(name = "Finanzas", description = "Operaciones relacionadas con finanzas")
public class FinanzasController {

    @Autowired
    FinanzasService cuotaService;

    public FinanzasController(FinanzasService cuotaService) {
        this.cuotaService = cuotaService;
    }

    @PostMapping("/pagar")
    @Operation(summary = "Pagar cuota", description = "Permite pagar la cuota de un miembro por identificación")
    public String pagarCuota(@RequestParam Integer identificacion) {
        return cuotaService.pagarCuota(identificacion);
    }


    @PostMapping("/obtener")
    @Operation(summary = "Obtener cuota", description = "Obtiene la cuota de un miembro por identificación")
    public String obtenerCuota(@RequestParam Integer identificacion) {
        return cuotaService.obtenerCuota(identificacion);
    }
}
