package com.example.demo2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kierowca {

    private Kluczyki kluczyki;

    private PrawoJazdy prawoJazdy;

/*    @Autowired
    public void setKluczyki(Kluczyki kluczyki) {
        this.kluczyki = kluczyki;
    }

    @Autowired
    public void setPrawoJazdy(PrawoJazdy prawoJazdy) {
        this.prawoJazdy = prawoJazdy;
    }*/

    public Kierowca(Kluczyki kluczyki, PrawoJazdy prawoJazdy) {
        this.kluczyki = kluczyki;
        this.prawoJazdy = prawoJazdy;
    }
}
