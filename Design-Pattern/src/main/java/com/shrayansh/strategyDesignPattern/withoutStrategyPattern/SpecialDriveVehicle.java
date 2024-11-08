package com.shrayansh.strategyDesignPattern.withoutStrategyPattern;

public class SpecialDriveVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("special drive capability");
    }
}
