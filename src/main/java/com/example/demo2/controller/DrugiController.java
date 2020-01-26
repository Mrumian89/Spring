package com.example.demo2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/param")
@RestController
public class DrugiController {

    @GetMapping("/tablice")
    public String tablice(@RequestParam String[] strs) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i < strs.length; i++) {
            sb.append(strs[i]);
            if(i != strs.length-1) {
            sb.append("; ");
            }
        }
        return sb.toString();
    }



    @GetMapping("/dodaj")
    public int dodaj (@RequestParam("pierwsza") int a, @RequestParam("druga") int b) {
        return a + b;
    }

    @GetMapping("/odejmij")
    public int odejmij (@RequestParam("liczba_jeden") int a, @RequestParam("liczba_dwa") int b) {
       return a - b;
    }

    @GetMapping("/pomnoz")
    public int pomnoz (@RequestParam(required = false) Integer a, @RequestParam(required = false) Integer b){
        if (a==null) {
            a = 0;
        }
        if (b == null) {
            b = 0;
        }
        return a * b;
    }

    @GetMapping("/podziel")
    public int podziel (@RequestParam(required = false) Integer a, @RequestParam(required = false) Integer b){
        if (a==null) {
            a = 0;
        }
        if (b == null) {

            b = 1;
        }
        return a * b;
    }


}
