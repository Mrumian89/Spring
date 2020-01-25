package com.example.demo2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Samochod {

    private Kierowca kierowca;
    private Kola kola;
    private Silnik silnik;

/*//    @Autowired
//    public void setKierowca(Kierowca kierowca) {
//        this.kierowca = kierowca;
//    }
//
//    @Autowired
//    public void setKola(Kola kola) {
//        this.kola = kola;
//    }
//
//    @Autowired
//    public void setSilnik(Silnik silnik) {
//        this.silnik = silnik;
//    }*/


    public Samochod(Kierowca kierowca, Kola kola, Silnik silnik) {
        this.kierowca = kierowca;
        this.kola = kola;
        this.silnik = silnik;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Hello World");
    }
}
