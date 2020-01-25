package com.example.demo2.Ciastko;

import org.springframework.stereotype.Component;

@Component
public class Jas {
    public Jas(Ciastko ciastko){
        if(ciastko.ugryz()){
            System.out.println("Jaś: Mniam");
        } else {
            System.out.println("Jaś: Już ugryzione");
        }
        }
}

