package org.example.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class CalculatorController {
    private final CalculatorService calculatorService;

    @GetMapping("/calculacte")
    public String calculate(@RequestParam int averageSalary, @RequestParam int amountVacationDays) {
        log.info("GET /calculacte");
        return calculatorService.calculate(averageSalary, amountVacationDays);
    }
}
