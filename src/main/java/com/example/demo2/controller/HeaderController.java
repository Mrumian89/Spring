package com.example.demo2.controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/header")
@RestController
public class HeaderController {

    @GetMapping("/dodaj")
    public int dodaj (@RequestHeader("Header_A") int a, @RequestHeader("Header_B") int b) {
        return a + b;
    }

    @GetMapping("/odejmij")
    public int odejmij (@RequestHeader("header_A") int a, @RequestHeader("header_B") int b) {
        return a - b;
    }

}

