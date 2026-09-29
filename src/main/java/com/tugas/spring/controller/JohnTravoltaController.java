package com.tugas.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class JohnTravoltaController {

    @GetMapping("/api/john-travolta")
    public Map<String, Object> johnTravolta() {
        return Map.of(
                "name", "John Travolta",
                "job", "Actor",
                "spring", "Hello John Travolta! This response is served by Spring Boot.",
                "message", "John Travolta berhasil dibuat sebagai endpoint Spring."
        );
    }
}
