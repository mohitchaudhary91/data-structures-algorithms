package org.developer.patterns.solid.single_responsibility.correct;

import org.developer.patterns.solid.single_responsibility.Marker;

public class Invoice {

    Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // only one reason to change
    public int calculateTotal() {
        return marker.getPrice() * quantity;
    }
}
