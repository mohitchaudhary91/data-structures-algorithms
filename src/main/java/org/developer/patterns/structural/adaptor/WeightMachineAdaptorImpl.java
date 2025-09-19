package org.developer.patterns.structural.adaptor;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor {

    WeightMachine weightMachine;

    public WeightMachineAdaptorImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double poundWeight = weightMachine.getWeightInPound();
        return poundWeight * .45;
    }
}
