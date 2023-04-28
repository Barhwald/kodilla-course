package com.kodilla.good.patterns.challenges;

public class EbayOrderService implements ProductOrderService {

    private final String name = "eBAY";
    @Override
    public boolean rent(final User user, final Product product, double total) {
        System.out.printf("""
                || %s ||
                
                User: %s
                Item: %s
                Quantity: %d
                Total: %.2f
                """, name, user.getName(), product.type(), product.quantity(), product.price());
        return true;
    }
}
