package com.example.demo2.Ekspres;

import org.springframework.stereotype.Component;

@Component
public class Programista {
    private Ekspres ekspres;
    private Computer computer;

    public Programista(Ekspres ekspres, Computer computer) {
        this.ekspres = ekspres;
        this.computer = computer;
    }
}
