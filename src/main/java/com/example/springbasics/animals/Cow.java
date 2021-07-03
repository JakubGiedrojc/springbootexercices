package com.example.springbasics.animals;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal{
    @Override
    public String voice() {
        return "Muuu muu";
    }
    public String getName(){
        return "Cow";
    }
}
