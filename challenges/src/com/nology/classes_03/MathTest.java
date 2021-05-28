package com.nology.classes_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    public Math math;

    @BeforeEach
    void setUp() {
        this.math = new Math(3.14);
    }

    @Test
    void pow() {
        double result = math.pow(2, 5);
        assertEquals(32.0, result);
    }

    @Test
    void min() {
        double result = math.min(2, 5);
        assertEquals(2, result);
    }

    @Test
    void max() {
        double result = math.max(2, 5);
        assertEquals(5, result);
    }

    @Test
    void round() {
        double result = math.round(2.420);
        assertEquals(2, result);
    }
}