package org.developer.patterns.behavioral.state;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Machine is in idle state");
    }

    @Override
    public void clickOnInsertAmount(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new MoneyState());
    }

    @Override
    public void insertAmount(VendingMachine machine, double amount) throws Exception {
        throw new Exception("First you need to click on insert amount button");
    }

    @Override
    public void clickOnSelectProduct(VendingMachine machine) throws Exception {
        throw new Exception("First you need to click on insert amount button");
    }

    @Override
    public void selectProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("You cannot choose product in idle state");
    }

    @Override
    public double clickOnCancelRefund(VendingMachine machine) throws Exception {
        throw new Exception("There is no money to be refunded in idle state");
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("You need insert amount to dispense the product");
    }
}
