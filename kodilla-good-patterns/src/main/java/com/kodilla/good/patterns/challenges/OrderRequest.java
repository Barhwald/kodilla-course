package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private Product product;
    private double totalCost;
    public static int orderNumber = 0;

    public OrderRequest(User user, Product product) {
        this.user = user;
        this.product = product;
        this.totalCost = product.price() * product.quantity();
        orderNumber++;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
