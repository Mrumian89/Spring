package com.example.demo2.Ciastko;

import org.springframework.stereotype.Component;

@Component
public class Malgosia {
    public Malgosia(Ciastko ciastko){
        if(ciastko.ugryz()){
            System.out.println("Małgosia: Mniam");
        } else {
            System.out.println("Małgosia: Już ugryzione");
        }
        }
    }

