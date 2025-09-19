package org.developer.patterns.structural.facade;

public class MainClass {

    public static void main(String[] args) {
        OrderFacade order = new OrderFacade();
        order.createOrder();
    }
}
