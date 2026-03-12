package com.devops.jacoco_lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5, 5)); // [cite: 43]
    }

    @Test
    void testMultiply() {
        assertEquals(25, calculator.multiply(5, 5)); // [cite: 72]
    }
}