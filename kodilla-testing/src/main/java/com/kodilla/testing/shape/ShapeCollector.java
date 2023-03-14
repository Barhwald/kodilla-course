package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList;

    public ShapeCollector() {
        this.shapeList = new ArrayList<>();
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapeList.contains(shape);
    }

    public Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public String showFigures() {
        String result = "";

        for (Shape shape : shapeList) {
            result = result + shape.getShapeName();
        }

        return result;
    }

}
