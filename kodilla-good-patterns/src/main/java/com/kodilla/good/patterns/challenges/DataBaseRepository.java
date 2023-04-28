package com.kodilla.good.patterns.challenges;

public class DataBaseRepository implements OrderRepository{
    @Override
    public void createOrder(User user, Product product) {
        System.out.println("Order no. " + OrderRequest.orderNumber + " was saved in data base\n");
    }
}
