package org.developer.patterns.solid.single_responsibility.correct;

public class InvoicePrinter {
    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    // only one reason to change
    public void printInvoice() {
        // print invoice
    }
}
