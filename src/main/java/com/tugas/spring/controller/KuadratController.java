package com.tugas.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class KuadratController {

    @GetMapping("/api/kuadrat")
    public Map<String, Object> hitung(
            @RequestParam double a,
            @RequestParam double b,
            @RequestParam double c) {

        Map<String, Object> result = new LinkedHashMap<>();

        if (a == 0) {
            result.put("status", "error");
            result.put("message", "Nilai a tidak boleh 0 karena ini bukan persamaan kuadrat.");
            return result;
        }

        double diskriminan = b * b - 4 * a * c;

        result.put("persamaan", a + "x^2 + " + b + "x + " + c + " = 0");
        result.put("a", a);
        result.put("b", b);
        result.put("c", c);
        result.put("diskriminan", diskriminan);

        if (diskriminan > 0) {
            double x1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
            double x2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
            result.put("jenis_akar", "Dua akar real berbeda");
            result.put("x1", x1);
            result.put("x2", x2);
        } else if (diskriminan == 0) {
            double x = -b / (2 * a);
            result.put("jenis_akar", "Satu akar real kembar");
            result.put("x1", x);
            result.put("x2", x);
        } else {
            result.put("jenis_akar", "Akar kompleks");
            double real = -b / (2 * a);
            double imag = Math.sqrt(-diskriminan) / Math.abs(2 * a);
            result.put("bagian_real", real);
            result.put("bagian_imajiner", imag);
            result.put("akar_1", real + " + " + imag + "i");
            result.put("akar_2", real + " - " + imag + "i");
        }

        return result;
    }
}
