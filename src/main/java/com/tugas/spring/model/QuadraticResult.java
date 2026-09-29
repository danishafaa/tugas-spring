package com.tugas.spring.model;

public class QuadraticResult {
    private final double a;
    private final double b;
    private final double c;
    private final double discriminant;
    private final String message;

    public QuadraticResult(double a, double b, double c, double discriminant, String message) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = discriminant;
        this.message = message;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    public double getDiscriminant() { return discriminant; }
    public String getMessage() { return message; }
}
