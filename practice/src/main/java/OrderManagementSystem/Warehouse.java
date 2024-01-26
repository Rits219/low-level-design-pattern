package OrderManagementSystem;

public class Warehouse {
    Inventory inventory;
    private int warehouseId;
    private Address address;

    public Warehouse(int warehouseId, Address address) {
        this.inventory = new Inventory();
        this.warehouseId = warehouseId;
        this.address = address;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void addProduct(Product product, ProductController productController) {
        this.inventory.addProduct(product, productController);
    }

    public boolean containsProduct(Product product) {
        return inventory.containProduct(product);
    }

    public void displayInventory(){
        inventory.display();
    }
}
