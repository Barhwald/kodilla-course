package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShopSupplier implements FoodSupplier {

    private final String name = "Gluten Free Shop";

    @Override
    public void process(Product product) {
        System.out.printf("""
                Supplier: %s
                Product: %s
                Quantity: %.2f
                Measure unit: %s
                
                """, name, product.getType(), product.getQuantity(), product.getMeasureUnit().toString().toLowerCase());
    }
}
