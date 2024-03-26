package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderValidatorTest {

    @Test
    public void shouldAcceptOnlyBondAndEquity() {
        OrderValidator orderValidator = new OrderValidator();
        assertFalse(orderValidator.isValidOperation(new MutualFund()));
    }

    @Test
    public void shouldRejectEmptyQuantities() {
        OrderValidator orderValidator = new OrderValidator();
        Instrument bondOperation = new Bond();
        assertFalse(orderValidator.isValidOperation(bondOperation));

        bondOperation.setQuantity(Double.valueOf("3.4"));
        assertTrue(orderValidator.isValidOperation(bondOperation));
    }

    @Test
    public void shouldAcceptOnlyAllowedQuantitiesForEquities() {
        OrderValidator orderValidator = new OrderValidator();
        Instrument operation = new Equity(Double.valueOf("4"));
        assertFalse(orderValidator.isValidOperation(operation));

        operation.setQuantity(Double.valueOf("5"));
        assertTrue(orderValidator.isValidOperation(operation));

        operation.setQuantity(Double.valueOf("5000"));
        assertFalse(orderValidator.isValidOperation(operation));

        operation.setQuantity(Double.valueOf("5.5"));
        assertFalse(orderValidator.isValidOperation(operation));
    }

    @Test
    public void shouldAcceptOnlyAllowedQuantitiesForBonds() {
        OrderValidator orderValidator = new OrderValidator();
        Instrument operation = new Bond(Double.valueOf("-4"));
        assertFalse(orderValidator.isValidOperation(operation));

        operation.setQuantity(Double.valueOf("5000"));
        assertTrue(orderValidator.isValidOperation(operation));
    }
}