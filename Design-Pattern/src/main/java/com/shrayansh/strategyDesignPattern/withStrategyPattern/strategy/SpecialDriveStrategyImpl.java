package com.shrayansh.strategyDesignPattern.withStrategyPattern.strategy;

public class SpecialDriveStrategyImpl implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("special drive capability");
    }
}
