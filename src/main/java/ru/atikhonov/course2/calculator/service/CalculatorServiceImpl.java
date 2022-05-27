package ru.atikhonov.course2.calculator.service;

import org.springframework.stereotype.Service;
import java.text.DecimalFormat;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    private String formatExpression(float num1, char operator, float num2, float result) {
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        return String.format("%s %c %s = %s", format.format(num1), operator,
                format.format(num2), format.format(result));
    }

    @Override
    public String add(float num1, float num2) {
        float result = num1 + num2;
        return formatExpression(num1, '+', num2, result);
    }

    @Override
    public String substract(float num1, float num2) {
        float result = num1 - num2;
        return formatExpression(num1, '-', num2, result);
    }

    @Override
    public String multiply(float num1, float num2) {
        float result = num1 * num2;
        return formatExpression(num1, '*', num2, result);
    }

    @Override
    public String divide(float num1, float num2) {
        if (num2 == 0) {
            return "Деление на ноль невозможно!";
        }
        float result = num1 / num2;
        return formatExpression(num1, '/', num2, result);
    }

}
