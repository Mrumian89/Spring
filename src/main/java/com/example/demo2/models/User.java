package com.example.demo2.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String nazwisko;
    private int wiek;

    private List<String> uprawnienia;

    public User(String name, String nazwisko, int wiek) {
        this.name = name;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.uprawnienia = new ArrayList<>();
    }

    public List<String> getUprawnienia() {
        return uprawnienia;
    }

    public void addUprawnienia(String uprawnienia) {
        this.uprawnienia.add(uprawnienia);
    }

    public void removeUprawnienia(String uprawnienia) {
        this.uprawnienia.remove(uprawnienia);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNazwisko() {
        return nazwisko;
    }


    public int getWiek() {
        return wiek;
    }

}
