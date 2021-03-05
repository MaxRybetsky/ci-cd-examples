package com.rybetsky.service.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciServiceTest {
    @Test
    public void whenComputeElementAt5PositionThenReturn3() {
        int expected = 3;
        int n = 5;
        assertEquals(expected, FibonacciService.computeAnElementAt(n));
    }

    @Test
    public void whenComputeElementAt10PositionThenReturn34() {
        int expected = 34;
        int n = 10;
        assertEquals(expected, FibonacciService.computeAnElementAt(n));
    }

    @Test
    public void whenComputeElementAt15PositionThenReturn377() {
        int expected = 377;
        int n = 15;
        assertEquals(expected, FibonacciService.computeAnElementAt(n));
    }

    @Test
    public void whenComputeElementAtZeroPositionThenException() {
        int n = 0;
        assertThrows(IllegalArgumentException.class, () -> FibonacciService.computeAnElementAt(n));
    }

    @Test
    public void whenComputeElementAtMinus5PositionThenException() {
        int n = 0;
        assertThrows(IllegalArgumentException.class, () -> FibonacciService.computeAnElementAt(n));
    }
}