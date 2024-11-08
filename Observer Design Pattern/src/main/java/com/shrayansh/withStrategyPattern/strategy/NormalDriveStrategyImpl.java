package com.shrayansh.withStrategyPattern.strategy;

public class NormalDriveImpl implements Drive{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
