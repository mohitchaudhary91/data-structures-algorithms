package org.developer.patterns.solid.single_responsibility.correct;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    // only one reason to change
    public void saveToDB() {
        // save to database
    }
}
