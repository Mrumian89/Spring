package com.example.demo2.Kalkulator;

public class Kalkulator {

    private static Kalkulator INSTANCE = new Kalkulator();

    private Kalkulator() {
    }

    public static Kalkulator getInstance() {
        return INSTANCE;
    }

    public int dodaj (int a, int b) {
        return a + b;
    }
}