package org.developer.patterns.structural.adaptor;

public class Client {

    public static void main(String[] args) {
        WeightMachineAdaptor adaptor = new WeightMachineAdaptorImpl(new BabiesWeightMachine());
        System.out.println(adaptor.getWeightInKg());
    }
}
