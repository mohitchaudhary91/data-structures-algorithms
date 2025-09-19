package org.developer.patterns.structural.facade;

public class OrderFacade {

    private final Product product;
    private final Payment payment;
    private final Notification notification;

    public OrderFacade() {
        product = new Product();
        payment = new Payment();
        notification = new Notification();
    }

    void createOrder() {
        product.getProduct();
        payment.makePayment();
        notification.sendNotification();
    }
}
