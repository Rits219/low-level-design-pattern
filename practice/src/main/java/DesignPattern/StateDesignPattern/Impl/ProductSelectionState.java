package DesignPattern.StateDesignPattern.Impl;

import DesignPattern.StateDesignPattern.State;
import DesignPattern.StateDesignPattern.model.Coin;
import DesignPattern.StateDesignPattern.model.ItemShelf;
import DesignPattern.StateDesignPattern.model.VendingMachine;

public class ProductSelectionState implements State {
    @Override
    public void clickedOnEnterCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("not allowed exception");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("not allowed exception");
    }

    @Override
    public void clickedOnCancelButton(VendingMachine machine) {
        machine.returnFullMoney();
    }

    @Override
    public void clickedOnProductSelectButton(VendingMachine machine) throws Exception {
        throw new Exception("not allowed exception");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int itemShelfCode) throws Exception {

        ItemShelf itemShelf = machine.getItemShelf(itemShelfCode);
        System.out.println("choosed {} product" + itemShelf.getItem().getItemType());
        double totalCoinValueInMachine = machine.getTotalCoinValue();
        double itemPrice = itemShelf.getItem().getPrice();
        if (itemPrice <= totalCoinValueInMachine) {
            double returnCoinValue = totalCoinValueInMachine - itemPrice;
            machine.setVendingMachineState(new DispenseProductState(machine, itemShelfCode));
            System.out.println("returned %s amount to user" + returnCoinValue);
        } else {
            machine.setVendingMachineState(new IdleSate());
            throw new Exception("Insufficient amount");
        }
    }

    @Override
    public void dispenseProduct(VendingMachine machine, int itemShelfCode) throws Exception {
        throw new Exception("not allowed exception");
    }
}
