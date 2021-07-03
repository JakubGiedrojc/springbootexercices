package com.example.springbasics.animals;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
    @Override
    public String voice() {
        return "miau miau";
    }
    public String getName(){
        return "Cat";
    }
}
