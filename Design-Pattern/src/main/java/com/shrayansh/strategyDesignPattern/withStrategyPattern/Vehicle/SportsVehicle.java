package com.shrayansh.strategyDesignPattern.withStrategyPattern.Vehicle;


import com.shrayansh.strategyDesignPattern.withStrategyPattern.strategy.SpecialDriveStrategyImpl;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SpecialDriveStrategyImpl());
    }
}