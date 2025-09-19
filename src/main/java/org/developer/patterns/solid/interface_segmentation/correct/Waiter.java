package org.developer.patterns.solid.interface_segmentation.correct;

public class Waiter implements WaiterInterface {

    @Override
    public void takeOrder() {
        System.out.println("Taking orders");
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving customers");
    }

    /*
    Here now we have segmented the interface with specially for waiter and chef separately.
    So waiter implements only waiter interface and is not unnecessarily implementing chef methods.
     */
}
