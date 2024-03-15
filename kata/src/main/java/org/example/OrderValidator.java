package org.example;

public class OrderValidator {

    public boolean isValidOperation(Instrument operation) {
        if (!(operation instanceof Bond || operation instanceof Equity))
            return false;


        return false;
    }
}
