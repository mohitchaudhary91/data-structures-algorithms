package org.developer.patterns.behavioral.state;

import java.util.Arrays;
import java.util.List;

public class VendingMachine {

    private State vendingMachineState;
    private List<Integer> inventory;
    private double amount;

    public VendingMachine() {
        this.vendingMachineState = new IdleState();
        this.inventory = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        this.amount = 0.0;
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Integer> getInventory() {
        return inventory;
    }

    public void setInventory(List<Integer> inventory) {
        this.inventory = inventory;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
