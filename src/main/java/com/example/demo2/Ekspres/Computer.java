package com.example.demo2.Ekspres;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Component
public class Computer {
    public static int i = 1;

    public Computer() {
        System.out.println("Komputer: " + i++);
    }
}
