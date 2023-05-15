package org.example.services;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CalculatorServiceImplTest extends TestCase {
    @Autowired
    private CalculatorService calculatorService;

    @Test
    void calculate() {
        String result = calculatorService.calculate(120000, 28);
        assertThat(result).isEqualTo("9556,31");
    }
}