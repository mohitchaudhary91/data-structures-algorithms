package org.developer.patterns.behavioral.state;

public interface State {

    void clickOnInsertAmount(VendingMachine machine) throws Exception;

    void insertAmount(VendingMachine machine, double amount) throws Exception;

    void clickOnSelectProduct(VendingMachine machine) throws Exception;

    void selectProduct(VendingMachine machine, int code) throws Exception;

    double clickOnCancelRefund(VendingMachine machine) throws Exception;

    void dispenseProduct(VendingMachine machine, int code) throws Exception;
}
