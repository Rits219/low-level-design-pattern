package DesignPattern.AdapterDesignPattern;

import DesignPattern.AdapterDesignPattern.Adaptee.WeightMachineAdapter;
import DesignPattern.AdapterDesignPattern.Adaptee.WeightMachineAdapterImpl;
import DesignPattern.AdapterDesignPattern.Adapter.WeightMachineForBabies;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKgs());
    }
}
