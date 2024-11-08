package com.shrayansh.strategyDesignPattern.withStrategyPattern.Vehicle;

import com.shrayansh.strategyDesignPattern.withStrategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObj;

    //this is known as constructor injection
    public Vehicle(DriveStrategy driveObj) {
        this.driveObj = driveObj;
    }

    public void drive() {
        driveObj.drive();
    }
}
