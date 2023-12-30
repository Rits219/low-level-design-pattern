package StateDesignPattern.model;

public class ItemShelf {
    private Item item;
    private int codeNumber;
    private boolean isAvailable;

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCodeNumber() {
        return this.codeNumber;
    }

    public void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    public boolean getAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public ItemShelf(Item item, int codeNumber, boolean isAvailable) {
        this.item = item;
        this.codeNumber = codeNumber;
        this.isAvailable = isAvailable;
    }
}
