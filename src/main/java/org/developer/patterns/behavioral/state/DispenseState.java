package org.developer.patterns.behavioral.state;

public class DispenseState implements State {

    public DispenseState(VendingMachine machine, int code) {
        System.out.println("Machine is in dispense state");
        dispenseProduct(machine, code);
    }

    @Override
    public void clickOnInsertAmount(VendingMachine machine) throws Exception {
        throw new Exception("You cannot click on insert amount during product selection");
    }

    @Override
    public void insertAmount(VendingMachine machine, double amount) throws Exception {
        throw new Exception("You cannot insert amount during product selection");
    }

    @Override
    public void clickOnSelectProduct(VendingMachine machine) throws Exception {
        throw new Exception("Product already selected! Dispensing it");
    }

    @Override
    public void selectProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("Product already selected! Dispensing it");
    }

    @Override
    public double clickOnCancelRefund(VendingMachine machine) throws Exception {
        throw new Exception("Money cannot be returned as product is selected");
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int code) {
        System.out.println("Product Dispensed");
        machine.setVendingMachineState(new IdleState());
        machine.getInventory().remove(code);
    }
}
