package DesignPattern.StateDesignPattern.model;

public class Item {
    private ItemType itemType;
    private double price;

    public ItemType getItemType() {
        return this.itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item(double price, ItemType itemType) {
        this.price = price;
        this.itemType = itemType;
    }
}
