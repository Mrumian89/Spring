package com.example.demo2.configuration;

import com.example.demo2.Dzieci.Present;
import com.example.demo2.model.Kierowca;
import com.example.demo2.model.Kluczyki;
import com.example.demo2.model.PrawoJazdy;
import com.example.demo2.model.Samochod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class TestConfiguration {

/*
    @Bean
    public List<Samochod> samochod () {
        List<Samochod> out = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            out.add(new Samochod());
        }

        return out;
    }
*/

/*    public PrawoJazdy prawoJazdy () {
        return new PrawoJazdy();
    }

    public Kierowca kierowca () {
        return new Kierowca();
    }*/
/*
@Bean
public Kierowca kierowca (Kluczyki kluczyki, PrawoJazdy prawoJazdy) {
    return new Kierowca(kluczyki,prawoJazdy);
}*/
    @Bean
    public Present dlaMalgosi() {
        return new Present ("lalka");
}
    @Bean
    public Present dlaJasia() {
        return new Present ("auto");
    }

    @Bean
    public Present dlaZbysia() {
        return new Present ("klocki");
    }
}