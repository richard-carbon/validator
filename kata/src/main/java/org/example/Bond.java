package org.example;

public class Bond implements Instrument {
    private Double quantity;

    public Bond() {
    }
    public Bond(Double quantity) {
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
