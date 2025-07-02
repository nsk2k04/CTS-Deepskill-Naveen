package com.cts.week2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testEquality() {
        String expected = "CTS";
        String actual = "CTS";
        assertEquals(expected, actual, "Strings should be equal");
    }

    @Test
    public void testArrayEquality() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual, "Arrays should match");
    }

    @Test
    public void testBoolean() {
        assertTrue(5 > 1, "This should be true");
    }
}
