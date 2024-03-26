package org.example;

public class OrderValidator {

    public boolean isValidOperation(Instrument operation) {
        if (!(operation instanceof Bond || operation instanceof Equity))
            return false;

        if (operation.getQuantity() == null || operation.getQuantity() == 0 )
            return false;

        if (operation instanceof Equity) {

            if (operation.getQuantity() % 1 != 0)
                return false;

            if (operation.getQuantity() % 5 != 0)
                return false;

            if (Math.abs(operation.getQuantity()) > 1000)
                return false;

        } else if (operation instanceof Bond) {
            if (operation.getQuantity() < 0)
                return false;
        }


        return true;
    }
}
