package com.example.testing;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    int a = 2;
    int b = 3;

    @Test
    void testAdditionTwoNumbers(){
        int sum = calculator.add(a , b);
        assertEquals(6, sum);
    }

    @Test
    void testMultiplyTwoNumbers(){
       int sum = calculator.multiply(a, b);
       assertEquals(6, sum);
    }

    @Test
    void testSubstractionTwoNumbers(){
        int res = a - b;
        assertEquals(-1, res);
    }
}
