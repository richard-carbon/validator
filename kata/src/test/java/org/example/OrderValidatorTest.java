package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderValidatorTest {

    @Test
    public void shouldAcceptOnlyBondAndEquity() {
        OrderValidator orderValidator = new OrderValidator();
        assertFalse(orderValidator.isValidOperation(new MutualFund()));
    }
}