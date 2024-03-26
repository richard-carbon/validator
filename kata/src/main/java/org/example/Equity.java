package org.example;

public class Equity implements Instrument {

    private Double quantity;

    Equity() {
    }

    Equity(Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public Double getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
