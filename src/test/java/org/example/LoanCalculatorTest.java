package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.calculateMonthlyPayment;

public class LoanCalculatorTest {

    @Test
    void emiAmountTestCase() {
        double actualAmount = calculateMonthlyPayment(1000, 2, 12);
        double expectedAmount = 84.2388672841035;
        Assertions.assertEquals(actualAmount, expectedAmount);
    }
}
