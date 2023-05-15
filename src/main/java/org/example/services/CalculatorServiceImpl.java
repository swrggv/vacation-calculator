package org.example.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String calculate(int averageSalary, int amountVacationDays) {
        double averageEarnings = averageSalary / 12 / 29.3;
        double vacationPayment = averageEarnings * amountVacationDays;
        log.info("calculate vacation payments average salary = {}, amount vacation days = {}", averageSalary, amountVacationDays);
        return String.format("%.2f", vacationPayment);
    }
}
