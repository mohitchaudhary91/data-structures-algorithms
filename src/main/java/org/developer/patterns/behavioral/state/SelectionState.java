package org.developer.patterns.behavioral.state;

public class SelectionState implements State {

    public SelectionState() {
        System.out.println("Machine is in selection state");
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
    public void clickOnSelectProduct(VendingMachine machine) {
    }

    @Override
    public void selectProduct(VendingMachine machine, int code) {
        machine.setVendingMachineState(new DispenseState(machine, code));
    }

    @Override
    public double clickOnCancelRefund(VendingMachine machine) {
        double refundMoney = machine.getAmount();
        machine.setAmount(0.0);
        machine.setVendingMachineState(new IdleState());
        return refundMoney;
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("You cannot get product right now. First choose product");
    }
}
