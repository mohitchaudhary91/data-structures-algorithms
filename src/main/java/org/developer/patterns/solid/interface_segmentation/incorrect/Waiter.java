package org.developer.patterns.solid.interface_segmentation.incorrect;

public class Waiter implements RestaurantEmployee {

    @Override
    public void washDishes() {
        // not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving customers");
    }

    @Override
    public void cookFood() {
        // not my job
    }

    /*
    Interface segmentation explains that interfaces should be such that client
    should not implement unnecessary functions they do not need to need in above example
     */
}
