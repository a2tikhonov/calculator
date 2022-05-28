package ru.atikhonov.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.atikhonov.course2.calculator.service.CalculatorService;

import java.text.DecimalFormat;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    private String convertToString(float num1, char operator, float num2, float result) {
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        return String.format("%s %c %s = %s", format.format(num1), operator,
                format.format(num2), format.format(result));
    }

    @GetMapping
    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String showSumOf(@RequestParam float num1,@RequestParam float num2) {
        return convertToString(num1, '+', num2, calculatorService.add(num1, num2));
    }

    @GetMapping("/minus")
    public String showDifferenceOf(@RequestParam float num1,@RequestParam float num2) {
        return convertToString(num1, '-', num2, calculatorService.substract(num1, num2));
    }

    @GetMapping("/multiply")
    public String showProductOf(@RequestParam float num1,@RequestParam float num2) {
        return convertToString(num1, '*', num2, calculatorService.multiply(num1, num2));
    }

    @GetMapping("/divide")
    public String showQuotientOf(@RequestParam float num1,@RequestParam float num2) {
        if (num2 == 0) {
            return "Деление на ноль невозможно!";
        }
        return convertToString(num1, '/', num2, calculatorService.divide(num1, num2));
    }
}
