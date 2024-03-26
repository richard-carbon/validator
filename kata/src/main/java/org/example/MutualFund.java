package org.example;

public class MutualFund implements Instrument {

    private Double quantity;
    @Override
    public Double getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
}
