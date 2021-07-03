package com.example.springbasics.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class Monitor {
@Autowired
    public Monitor() {
    }

    public void display(double a){
        System.out.println(a);
    }
}
