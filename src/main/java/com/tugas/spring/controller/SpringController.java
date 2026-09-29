package com.tugas.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/spring")
public class SpringController {

    @GetMapping("/5w")
    public Map<String, String> fiveW() {
        Map<String, String> result = new LinkedHashMap<>();
        result.put("what", "Spring adalah framework Java untuk membangun aplikasi, terutama aplikasi web.");
        result.put("why", "Spring membantu membuat aplikasi lebih terstruktur, modular, mudah diuji, dan mudah dikembangkan.");
        result.put("when", "Spring mulai dikembangkan pada awal tahun 2000-an dan terus berkembang hingga sekarang.");
        result.put("who", "Spring dibuat oleh Rod Johnson dan dikembangkan bersama komunitas open-source.");
        result.put("where", "Spring digunakan pada aplikasi Java di berbagai lingkungan, termasuk server dan cloud.");
        return result;
    }

    @GetMapping("/version")
    public Map<String, String> version() {
        return Map.of(
                "framework", "Spring Boot",
                "project", "Tugas Spring",
                "version", "V1-V3"
        );
    }
}
