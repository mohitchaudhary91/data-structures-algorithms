package org.developer.patterns.solid.single_responsibility.incorrect;

import org.developer.patterns.solid.single_responsibility.Marker;

public class Invoice {
    Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // one reason to change
    public int calculateTotal() {
        return (marker.getPrice()) * quantity;
    }

    // second reason to change
    public void printInvoice() {
        // print invoice
    }

    // third reason to change
    public void saveToDB() {
        // save the record to database
    }
}
