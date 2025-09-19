package org.developer.patterns.solid.open_closed.correct;

import org.developer.patterns.solid.single_responsibility.correct.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
        // save to database
    }
}
