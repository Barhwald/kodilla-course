package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    public void processOrder(FoodSupplier foodSupplier, Product product) {
        foodSupplier.process(product);
        System.out.printf("""
                ORDER PROCESSED SUCCESSFULLY
                %s
                """, "-".repeat(30));

    }

}
