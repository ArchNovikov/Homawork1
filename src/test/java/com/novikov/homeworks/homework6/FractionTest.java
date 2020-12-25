package com.novikov.homeworks.homework6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FractionTest {
    private static Fraction fraction1;
    private static Fraction fraction2;
    private static Fraction fraction3;

    @BeforeAll
    static void setUp() {
        fraction1 = new FractionNumber(1, 3);
        fraction2 = new FractionNumber(2, 3);
        fraction3 = new FractionNumber(3, 4);
    }

    @Test
    void badFractionCreation() {
        assertThrows(IllegalArgumentException.class, () -> new FractionNumber(1,0));
    }

    @Test
    void testEquals() {
        assertEquals(new FractionNumber(1, 3), fraction1);
        assertNotEquals(fraction2, fraction1);
        assertEquals(new FractionNumber(3, 9), fraction1);
        assertEquals(new FractionNumber(3, 1), new FractionNumber(9, 3));
    }

    @Test
    void testPlusWithTheSameDenominator() {
        Fraction result = fraction1.plus(fraction2);
        assertEquals(new FractionNumber(3,3),result);
        assertEquals(new FractionNumber(1,1),result);
    }

    @Test
    void testPlusWithNotTheSameDenominator() {
        Fraction result = fraction1.plus(fraction3);
        assertEquals(new FractionNumber(13,12),result);
    }

    @Test
    void testMinusWithTheSameDenominator() {
        Fraction result = fraction2.minus(fraction1);
        assertEquals(new FractionNumber(1, 3), result);

    }

    void testMinusWithNotTheSameDenominator() {
        Fraction result = fraction3.minus(fraction1);
        assertEquals(new FractionNumber(5, 12), result);
    }

    @Test
    void testMultiply() {
        Fraction result = fraction3.multiply(fraction1);
        assertEquals(new FractionNumber(3, 12), result);
        assertEquals(new FractionNumber(1, 4), result);
    }

    @Test
    void divide() {
        Fraction result = fraction2.divide(fraction1);
        assertEquals(new FractionNumber(6, 3), result);
        assertEquals(new FractionNumber(2, 1), result);
    }
}