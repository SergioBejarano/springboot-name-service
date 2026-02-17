package com.sergiobejarano.nombre.api;

import com.sergiobejarano.nombre.model.NombreResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NombreController {

    private static final NombreResponse RESPONSE = new NombreResponse(
            "Sergio Bejarano",
            "Hola, mi nombre es Sergio Bejarano.");

    @GetMapping("/nombre")
    public NombreResponse obtenerNombre() {
        return RESPONSE;
    }
}
