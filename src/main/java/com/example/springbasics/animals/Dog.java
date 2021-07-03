package com.example.springbasics.animals;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    @Override
    public String voice() {
        return "Hau hau";
    }
    public String getName(){
        return "Dog";
    }
}
