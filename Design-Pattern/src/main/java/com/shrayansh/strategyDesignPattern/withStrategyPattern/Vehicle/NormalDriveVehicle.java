package com.shrayansh.strategyDesignPattern.withStrategyPattern.Vehicle;

import com.shrayansh.strategyDesignPattern.withStrategyPattern.strategy.NormalDriveStrategyImpl;

public class NormalDriveVehicle extends Vehicle{
    public NormalDriveVehicle() {
        super(new NormalDriveStrategyImpl());
    }
}
