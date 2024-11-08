package com.shrayansh.withStrategyPattern.strategy;

public class SpecialDriveImpl implements Drive{
    @Override
    public void drive() {
        System.out.println("special drive capability");
    }
}
