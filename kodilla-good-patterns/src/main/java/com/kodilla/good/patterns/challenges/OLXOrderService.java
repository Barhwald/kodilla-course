package com.kodilla.good.patterns.challenges;

public class OLXOrderService implements ProductOrderService{

    private final String name = "OLX";

    @Override
    public boolean rent(User user, Product product, double total) {
        System.out.printf("""
                || %s ||
                
                User: %s
                Item: %s
                Quantity: %d
                Total: %.2f
                """, name, user.getName(), product.type(), product.quantity(), total);
        return true;
    }
}
