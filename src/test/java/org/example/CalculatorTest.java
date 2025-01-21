package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {

        assertEquals(8, calculator.add(3,5));
        assertNotEquals(8, calculator.add(3, 4));
    }

    @Test
    void subtract(){
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void multiplication(){
        assertEquals(15, calculator.multiplication(3, 5));
        assertNotEquals(15, calculator.multiplication(3,4));
    }

    @Test
    void divide(){
        try{
            assertEquals(5, calculator.divide(20, 4));
        }catch(DivideByZeroException e){
            throw  new RuntimeException();
        }

        try{
            assertNotEquals(5, calculator.divide(20, 3));
        }catch(DivideByZeroException e){
            throw  new RuntimeException();
        }
        assertThrows(DivideByZeroException.class, () -> calculator.divide(12, 0));
    }

}