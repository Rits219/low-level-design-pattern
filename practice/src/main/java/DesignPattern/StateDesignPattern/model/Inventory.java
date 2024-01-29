package DesignPattern.StateDesignPattern.model;

import java.util.List;

public class Inventory {
    List<ItemShelf> itemShelfList;

    public List<ItemShelf> getItemShelfList() {
        return this.itemShelfList;
    }

    public void setItemShelfList(List<ItemShelf> itemShelfList) {
        this.itemShelfList = itemShelfList;
    }

    public void addItem(Item item, int code) throws Exception {
        for (ItemShelf itemShelf : itemShelfList
        ) {
            if (itemShelf.getCodeNumber() == code) {
                if (!itemShelf.getAvailable()) {
                    itemShelf.setAvailable(true);
                }
                throw new Exception("code is already present");
            }
        }
    }


}
