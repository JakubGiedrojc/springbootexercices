package com.example.springbasics.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Autowired
    private Monitor monitor;

    @Test
    void calculatorMultiplyTest(){
        //given
        Calculator calculator= new Calculator(monitor);
        //when
        double result = calculator.multiply(5,6);
        //then
        assertThat(result).isEqualTo(30.0);
    }
    @Test
    void calculatorDivideTest(){
        //given
        Calculator calculator = new Calculator(monitor);
        //when
        double result = calculator.divide(26,13);
        //then
        assertThat(result).isEqualTo(2.0);
    }
    @Test
    void calculatorSubtractTest(){
        //given
        Calculator calculator = new Calculator(monitor);
        //when
        double result=calculator.subtract(15,14);
        //then
        assertThat(result).isEqualTo(1.0);

    }

    @Test
    void calculatorAddTest(){
        //given
        Calculator calculator = new Calculator(monitor);
        //when
        double result = calculator.add(5,6);
        //then
        assertThat(result).isEqualTo(11.0);
    }

}