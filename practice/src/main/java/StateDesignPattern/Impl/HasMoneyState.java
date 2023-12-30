package StateDesignPattern.Impl;

import StateDesignPattern.State;
import StateDesignPattern.model.Coin;
import StateDesignPattern.model.VendingMachine;

import java.util.List;

public class HasMoneyState implements State {
    @Override
    public void clickedOnEnterCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("not allowed exception");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        List<Coin> coinList = machine.getCoins();
        coinList.add(coin);
        machine.setCoins(coinList);
        System.out.println("Inserted {} coin " + coin.name());
    }

    @Override
    public void clickedOnCancelButton(VendingMachine machine) {
        machine.returnFullMoney();
        machine.setVendingMachineState(new IdleSate());
    }

    @Override
    public void clickedOnProductSelectButton(VendingMachine machine) {
        System.out.println("clicked on product select button");
        machine.setVendingMachineState(new ProductSelectionState());
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
