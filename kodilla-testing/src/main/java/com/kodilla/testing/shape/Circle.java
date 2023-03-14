package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double field;

    public Circle(double field) {
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getField() {
        return this.field;
    }
}
