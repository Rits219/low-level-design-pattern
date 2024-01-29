package DesignPattern.StateDesignPattern.Impl;

import DesignPattern.StateDesignPattern.model.Coin;
import DesignPattern.StateDesignPattern.model.ItemShelf;
import DesignPattern.StateDesignPattern.model.VendingMachine;
import DesignPattern.StateDesignPattern.State;

public class DispenseProductState implements State {

    public DispenseProductState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("system is in dispense state");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickedOnEnterCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("not allowed exception");
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
        System.out.println("product is dispensed of %s item code" + itemShelfCode);
        ItemShelf itemShelf = machine.getItemShelf(itemShelfCode);
        itemShelf.setAvailable(false);
        machine.setVendingMachineState(new IdleSate());
    }
}
