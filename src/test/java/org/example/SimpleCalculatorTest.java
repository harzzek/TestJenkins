package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    @Test
    void add() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add("1,2,3");
        assertEquals(6, result);
    }

    @Test
    void addWithRegex() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add("1\n2,3");
        assertEquals(6, result);
    }

    @Test
    void addWithMoreRegex() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add("1,\n2,3");
        assertEquals(6, result);
    }

    @Test
    void addWithEmptyString() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }

    @Test
    void selfMadeDelimiter() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add("//;\n1;2");
        assertEquals(3, result);
    }
}