package com.example.demo2.Ciastko;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Scope(SCOPE_PROTOTYPE)

@Component
public class Ciastko {

    private boolean ugryzione = false;

    public boolean ugryz() {
        if(ugryzione) {
            return false;
        }
            System.out.printf("Chrup!");
            ugryzione = true;
            return true;
        }

    }


