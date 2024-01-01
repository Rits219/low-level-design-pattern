package DesignPattern.AdapterDesignPattern.Adaptee;

import DesignPattern.AdapterDesignPattern.Adapter.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKgs() {
        return weightMachine.getWeightInPounds() * 0.45;
    }
}
