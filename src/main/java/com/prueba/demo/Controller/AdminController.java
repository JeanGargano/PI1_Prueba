package com.prueba.demo.Controller;
import com.prueba.demo.Service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    // ===== Miembros =====
    @GetMapping("/miembros")
    public List<String> listarMiembros() {
        return adminService.obtenerMiembros();
    }


    // ===== Eventos =====
    @GetMapping("/eventos")
    public List<String> listarEventos() {
        return adminService.obtenerEventos();
    }


    // ===== Cuotas =====
    @GetMapping("/cuotas")
    public List<String> listarCuotas() {
        return adminService.obtenerCuotas();
    }

    // ===== Progresiones =====
    @GetMapping("/progresiones")
    public List<String> listarProgresiones () {
        return adminService.obtenerProgresiones();
    }

}
