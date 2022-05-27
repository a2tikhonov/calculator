package ru.atikhonov.course2.calculator.service;

import java.io.PrintStream;

public interface CalculatorService {
    String welcome();

    String add(float num1, float num2);

    String substract(float num1, float num2);

    String multiply(float num1, float num2);

    String divide(float num1, float num2);


}
