package StateDesignPattern;

import StateDesignPattern.model.Coin;
import StateDesignPattern.model.Inventory;
import StateDesignPattern.model.Item;
import StateDesignPattern.model.ItemShelf;
import StateDesignPattern.model.ItemType;
import StateDesignPattern.model.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        System.out.println("|");
        System.out.println("filling up vending maching inventory");
        System.out.println("|");

        addInventory(machine);
        displayMachine(machine);

        //operation start
        try {
            State state = machine.getVendingMachineState();
            state.clickedOnEnterCoinButton(machine);

            state = machine.getVendingMachineState();
//            state.insertCoin(machine, Coin.PENNY);
            state.insertCoin(machine, Coin.DIME);

            state = machine.getVendingMachineState();
            state.clickedOnProductSelectButton(machine);

            state = machine.getVendingMachineState();
            state.chooseProduct(machine, 1);

            displayMachine(machine);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void displayMachine(VendingMachine machine) {
        Inventory inventory = machine.getInventory();
        for (ItemShelf itemShelf : inventory.getItemShelfList()
        ) {
            System.out.println("code: " + itemShelf.getCodeNumber() +
                    " ,price: " + itemShelf.getItem().getPrice() +
                    ",isAvailable: " + itemShelf.getAvailable());
        }
    }

    private static void addInventory(VendingMachine machine) {
        Inventory inventory = machine.getInventory();
        List<ItemShelf> itemShelfList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (i < 3) {
                itemShelfList.add(new ItemShelf(new Item(i, ItemType.COKE), i, true));
            } else if (i < 6) {
                itemShelfList.add(new ItemShelf(new Item(i, ItemType.PEPSI), i, true));
            } else if (i < 9) {
                itemShelfList.add(new ItemShelf(new Item(i, ItemType.JUICE), i, true));
            } else {
                itemShelfList.add(new ItemShelf(new Item(i, ItemType.SODA), i, true));
            }
        }
        inventory.setItemShelfList(itemShelfList);
        machine.setInventory(inventory);
    }
}
