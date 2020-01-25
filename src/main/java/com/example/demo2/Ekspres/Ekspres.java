package com.example.demo2.Ekspres;

import org.springframework.stereotype.Component;


@Component
public class Ekspres {

    public static int i = 1;

    public Ekspres(){
        System.out.println("Ekspres do kawy: " + i++);
    }

}
