package DesignPattern.StateDesignPattern.Impl;

import DesignPattern.StateDesignPattern.State;
import DesignPattern.StateDesignPattern.model.Coin;
import DesignPattern.StateDesignPattern.model.VendingMachine;

public class IdleSate implements State {
    @Override
    public void clickedOnEnterCoinButton(VendingMachine machine) {
        System.out.println("clicked on enter coin button");
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("not allowed exception");
    }

    @Override
    public void clickedOnCancelButton(VendingMachine machine) throws Exception {
        throw new Exception("not allowed exception");
    }

    @Override
    public void clickedOnProductSelectButton(VendingMachine machine) throws Exception {
        throw new Exception("not allowed exception");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int itemShelfCode) throws Exception {
        throw new Exception("not allowed exception");
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int itemShelfCode) throws Exception {
        throw new Exception("not allowed exception");
    }
}
