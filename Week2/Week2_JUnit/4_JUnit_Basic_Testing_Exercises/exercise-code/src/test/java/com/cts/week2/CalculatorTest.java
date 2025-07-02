package com.cts.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(10, calc.add(7, 3), "7 + 3 should be 10");
    }

    @Test
    public void testSubtract() {
        assertEquals(4, calc.subtract(9, 5), "9 - 5 should be 4");
    }
}
