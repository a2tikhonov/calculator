package ru.atikhonov.course2.calculator.service;

import org.springframework.stereotype.Service;
import ru.atikhonov.course2.calculator.exceptions.DivideByNullExcepction;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    @Override
    public float substract(float num1, float num2) {
        return num1 - num2;
    }

    @Override
    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    @Override
    public float divide(float num1, float num2) {
        if (num2 == 0) {
            throw new DivideByNullExcepction("Деление на нуль невозможно!");
        }
        return num1 / num2;
    }

}
