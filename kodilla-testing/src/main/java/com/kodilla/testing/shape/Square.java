package com.kodilla.testing.shape;

public class Square implements Shape{

    private double field;

    public Square(double field) {
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
