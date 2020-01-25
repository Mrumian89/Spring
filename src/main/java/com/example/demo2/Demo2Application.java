package com.example.demo2;

import com.example.demo2.Kalkulator.Kalkulator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		Kalkulator.getInstance().dodaj(2,2);
		SpringApplication.run(Demo2Application.class, args);
	}

}
