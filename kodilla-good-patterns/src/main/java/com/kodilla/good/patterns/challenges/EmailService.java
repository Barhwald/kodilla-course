package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println(user.getName() +  ", you've just placed an order. Thank you!");
    }
}
