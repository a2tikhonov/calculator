package ru.atikhonov.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.atikhonov.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showWelcome() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String showSumOf(@RequestParam float num1,@RequestParam float num2) {
        return calculatorService.add(num1, num2);
    }

    @GetMapping("/minus")
    public String showDifferenceOf(@RequestParam float num1,@RequestParam float num2) {
        return calculatorService.substract(num1, num2);
    }

    @GetMapping("/multiply")
    public String showProductOf(@RequestParam float num1,@RequestParam float num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String showQuotientOf(@RequestParam float num1,@RequestParam float num2) {
        return calculatorService.divide(num1, num2);
    }
}
