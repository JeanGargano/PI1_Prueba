package com.prueba.demo.Controller;
import com.prueba.demo.Service.AdminService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
@RequestMapping("/admin")
@Tag(name = "Admin", description = "Operaciones administrativas")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    // ===== Miembros =====
    @GetMapping("/miembros")
    @Operation(summary = "Listar miembros", description = "Obtiene la lista de miembros (admin)")
    public List<String> listarMiembros() {
        return adminService.obtenerMiembros();
    }


    // ===== Eventos =====
    @GetMapping("/eventos")
    @Operation(summary = "Listar eventos", description = "Obtiene la lista de eventos (admin)")
    public List<String> listarEventos() {
        return adminService.obtenerEventos();
    }


    // ===== Cuotas =====
    @GetMapping("/cuotas")
    @Operation(summary = "Listar cuotas", description = "Obtiene la lista de cuotas (admin)")
    public List<String> listarCuotas() {
        return adminService.obtenerCuotas();
    }

    // ===== Progresiones =====
    @GetMapping("/progresiones")
    @Operation(summary = "Listar progresiones", description = "Obtiene la lista de progresiones (admin)")
    public List<String> listarProgresiones () {
        return adminService.obtenerProgresiones();
    }

}
