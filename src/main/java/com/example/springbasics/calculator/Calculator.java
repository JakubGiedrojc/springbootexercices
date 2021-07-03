package com.example.springbasics.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class Calculator {
    private final Monitor monitor;

    @Autowired
    public Calculator(Monitor monitor) {this.monitor=monitor;
    }

    public double add(double a, double b){
        Monitor monitor= new Monitor();
        monitor.display(a+b);
        return a+b;

    }

    public double subtract(double a, double b){
        Monitor monitor= new Monitor();
        monitor.display(a-b);
        return a-b;
    }

    public double multiply(double a, double b){
        Monitor monitor= new Monitor();
        monitor.display(a*b);
        return a*b;
    }
    public double divide(double a, double b){
        Monitor monitor= new Monitor();
        monitor.display(a/b);
        return a/b;
    }

}
