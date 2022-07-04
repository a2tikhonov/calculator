package ru.atikhonov.course2.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParamTest {

    CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void add(float a, float b) {
        assertEquals(4, out.add(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void substract(float a, float b) {
        assertEquals(0, out.substract(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void multiply(float a, float b) {
        assertEquals(4, out.multiply(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void divide(float a, float b) {
        assertEquals(1, out.divide(a, b));
    }


    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(2, 2)
        );
    }

}