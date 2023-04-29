package com.kodilla.good.patterns.challenges.food2door;

public class Main {

    public static void main(String[] args) {

        ExtraFoodShopSupplier extraFoodShopSupplier = new ExtraFoodShopSupplier();
        Product carrot = new Product("Carrot", 56, MeasureUnit.KG);

        HealthyShopSupplier healthyShopSupplier = new HealthyShopSupplier();
        Product wheat = new Product("Wheat", 40, MeasureUnit.BAGS);

        GlutenFreeShopSupplier glutenFreeShopSupplier = new GlutenFreeShopSupplier();
        Product water = new Product("Water", 140, MeasureUnit.BOTTLES);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(extraFoodShopSupplier, carrot);
        orderProcessor.processOrder(healthyShopSupplier, wheat);
        orderProcessor.processOrder(glutenFreeShopSupplier, water);

    }
}
