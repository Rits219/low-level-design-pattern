package StateDesignPattern;

import StateDesignPattern.model.Coin;
import StateDesignPattern.model.VendingMachine;

public interface State {
    public void clickedOnEnterCoinButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;

    public void clickedOnCancelButton(VendingMachine machine) throws Exception;

    public void clickedOnProductSelectButton(VendingMachine machine) throws Exception;

    public void chooseProduct(VendingMachine machine, int itemShelfCode) throws Exception;

    public void dispenseProduct(VendingMachine machine, int itemShelfCode) throws Exception;
}
