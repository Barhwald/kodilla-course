package com.kodilla.good.patterns.challenges.food2door;

public class Product {

    private String type;
    private double quantity;
    private MeasureUnit measureUnit;

    public Product(String type, double quantity, MeasureUnit measureUnit) {
        this.type = type;
        this.quantity = quantity;
        this.measureUnit = measureUnit;
    }

    public String getType() {
        return type;
    }

    public double getQuantity() {
        return quantity;
    }

    public MeasureUnit getMeasureUnit() {
        return measureUnit;
    }
}
