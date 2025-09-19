package org.developer.patterns.behavioral.state;

public class MoneyState implements State {

    public MoneyState() {
        System.out.println("Machine is in money state");
    }

    @Override
    public void clickOnInsertAmount(VendingMachine machine) {
    }

    @Override
    public void insertAmount(VendingMachine machine, double amount) {
        machine.setAmount(amount);
    }

    @Override
    public void clickOnSelectProduct(VendingMachine machine) {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void selectProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("You need to click on choose product first");
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
        throw new Exception("Product cannot be dispensed at this stage");
    }
}
