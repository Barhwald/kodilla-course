package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main(String[] args) {

//        MovieStore movieStore = new MovieStore();
//        movieStore.printMovies();
//
//        System.out.println();
//        System.out.println(factorial(10));

        // zadanie 13.2 productOrderService

        User user = new User("Mike");
        Product product = new Product("Electronics", 1, 2000.00);

        User user1 = new User("Howard");
        Product product1 = new Product("Furniture", 4, 50.25);


        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new EmailService(), new EbayOrderService(),
                new DataBaseRepository());

        ProductOrderProcessor productOrderProcessor1 = new ProductOrderProcessor(new EmailService(), new OLXOrderService(),
                new DataBaseRepository());


        productOrderProcessor.process(new OrderRequest(user, product));
        productOrderProcessor1.process(new OrderRequest(user1, product1));


    }

    // zadanie dodatkowe

    public static int factorial(int n) {

        int result = 1;

        while (n > 0) {
            result *= n;
            n -= 1;
        }

        return result;

    }

}
