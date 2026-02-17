package com.sergiobejarano.name.api;

import com.sergiobejarano.name.model.NameResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NameController {

    private static final NameResponse RESPONSE = new NameResponse(
            "Sergio Bejarano",
            "Hi! My name is Sergio Bejarano.");

    @GetMapping("/name")
    public NameResponse getName() {
        return RESPONSE;
    }
}
