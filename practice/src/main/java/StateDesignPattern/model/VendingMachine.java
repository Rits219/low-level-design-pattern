package StateDesignPattern.model;

import StateDesignPattern.Impl.IdleSate;
import StateDesignPattern.State;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private Inventory inventory;
    private State vendingMachineState;
    private List<Coin> coins;

    public List<Coin> getCoins() {
        return this.coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }


    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public State getVendingMachineState() {
        return this.vendingMachineState;
    }

    public void setVendingMachineState(State state) {
        this.vendingMachineState = state;
    }

    public VendingMachine() {
        this.inventory = new Inventory();
        this.vendingMachineState = new IdleSate();
        this.coins = new ArrayList<>();
    }

    public double getTotalCoinValue() {
        double value = 0;
        for (Coin coin : coins
        ) {
            value = value + coin.getValue();
        }
        return value;
    }

    public void returnFullMoney() {
        double value = getTotalCoinValue();
        System.out.println("returned %s amount" + value);
    }

    public ItemShelf getItemShelf(int itemShelfCode) throws Exception {
        for (ItemShelf itemShelf : inventory.getItemShelfList()
        ) {
            if (itemShelf.getCodeNumber() == itemShelfCode) {
                if (itemShelf.getAvailable()) {
                    return itemShelf;
                } else {
                    System.out.println("Item is sold out");
                    throw new Exception("incorrect item code,item is sold out");
                }
            }
        }
        throw new Exception("itemcode is invalid");
    }


}
