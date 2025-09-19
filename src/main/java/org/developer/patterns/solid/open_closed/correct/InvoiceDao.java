package org.developer.patterns.solid.open_closed.correct;

import org.developer.patterns.solid.single_responsibility.correct.Invoice;

public interface InvoiceDao {
    void save(Invoice invoice);
}
