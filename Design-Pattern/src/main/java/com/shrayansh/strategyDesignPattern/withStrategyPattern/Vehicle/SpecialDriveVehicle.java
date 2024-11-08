package com.shrayansh.strategyDesignPattern.withStrategyPattern.Vehicle;


import com.shrayansh.strategyDesignPattern.withStrategyPattern.strategy.SpecialDriveStrategyImpl;

public class SpecialDriveVehicle extends Vehicle {
    public SpecialDriveVehicle() {
        super(new SpecialDriveStrategyImpl());
    }
}
