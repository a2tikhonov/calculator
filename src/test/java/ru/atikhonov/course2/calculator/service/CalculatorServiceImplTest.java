package ru.atikhonov.course2.calculator.service;

import org.junit.jupiter.api.Test;
import ru.atikhonov.course2.calculator.exceptions.DivideByNullExcepction;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    void add() {
        assertEquals(4, out.add(2, 2));
        assertEquals(6, out.add(3, 3));
    }

    @Test
    void substract() {
        assertEquals(0, out.substract(2, 2));
        assertEquals(2, out.substract(8, 6));
    }

    @Test
    void multiply() {
        assertEquals(4, out.multiply(2, 2));
        assertEquals(10, out.multiply(5, 2));
    }

    @Test
    void divide() {
        assertEquals(1, out.divide(2, 2));
        assertEquals(5, out.divide(100, 20));
    }

    @Test
    void shouldThrowExceptionWhenDividedByZero() {
        assertThrows(DivideByNullExcepction.class, () -> out.divide(2, 0) );
    }
}