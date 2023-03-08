package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeEach
    static void doStuff(){
        calculator = new Calculator();
    }

    @Test
    void testAddingTwoNumbersHappyFlow() {
        Integer result = calculator.addNumbers(1, 2);
        Integer iAmExpecting = 3;
        assertEquals(iAmExpecting, result);
    }

    @Test
    void testAddingTwoNumbersNullValues() {
        assertThrows(NullPointerException.class, () -> calculator.addNumbers(1, null ));
    }
}