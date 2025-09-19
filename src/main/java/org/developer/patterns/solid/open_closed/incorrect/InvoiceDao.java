package org.developer.patterns.solid.open_closed.incorrect;

import org.developer.patterns.solid.single_responsibility.correct.Invoice;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // already written code
        /* how to make it extensible but closed for modification
        as file is already tested and live in production/
         */
    }
}
