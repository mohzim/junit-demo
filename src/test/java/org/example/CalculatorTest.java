package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void addCheck(){
        Calculator calc = new Calculator();
        int actual = calc.add(1,2);
        int expected = 3;
        assertEquals(expected,actual);
    }

}