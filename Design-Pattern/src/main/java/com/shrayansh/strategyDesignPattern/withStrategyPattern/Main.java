package com.shrayansh.strategyDesignPattern.withStrategyPattern;

import com.shrayansh.strategyDesignPattern.withStrategyPattern.Vehicle.NormalDriveVehicle;
import com.shrayansh.strategyDesignPattern.withStrategyPattern.Vehicle.SportsVehicle;

public class Main {
    public static void main(String[] args) {
//        SportsVehicle sportsVehicle = new SportsVehicle();
//        sportsVehicle.drive();

        NormalDriveVehicle normalDriveVehicle = new NormalDriveVehicle();
        normalDriveVehicle.drive();
    }
}
