package com.example.demo2.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Calendar;

@Validated
@RequestMapping("/test")
@RestController
public class PierwszyController {

    @GetMapping("/dodaj/{a}/{b}")

    public int dodaj (@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/dzienTygodnia/{rok}/{miesiac}/{dzien}")
    public int dzientygodnia(
            @PathVariable int dzien,
            @PathVariable @Min(1) @Max(12) int miesiac,
            @PathVariable int rok) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, rok);
        calendar.set(Calendar.MONTH, miesiac -1);
        calendar.set(Calendar.DAY_OF_MONTH, dzien);
        return calendar.get(Calendar.DAY_OF_WEEK);

    }

    @GetMapping("/odejmij/{a}/{b}")
    public int odejmij (@PathVariable int a, @PathVariable int b) {
        return a - b;
    }

    @GetMapping("/pomnoz/{a}/{b}")
    public int pomnoz (@PathVariable int a, @PathVariable int b) {
        return a*b;
    }



    @RequestMapping("/hello")
    public String helloworld() {
        return "Hello World!!";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String helloworld2() {
        return "Hello World!! again";
    }

}
