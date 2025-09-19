package org.developer.patterns.behavioral.state;

public class MainClass {

    public static void main(String[] args) throws Exception {
        VendingMachine machine = new VendingMachine();

        State state = machine.getVendingMachineState();
        System.out.println("---------------------------------");
        state.clickOnInsertAmount(machine);

        state = machine.getVendingMachineState();
        System.out.println("---------------------------------");
        state.insertAmount(machine, 50.0);
        state.clickOnSelectProduct(machine);

        state = machine.getVendingMachineState();
        System.out.println("---------------------------------");
        state.selectProduct(machine, 5);

    }
}
