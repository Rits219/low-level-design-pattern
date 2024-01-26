package OrderManagementSystem;

public class Product {
    private int productId;
    private double price;
    private String productName;

    public Product(int productId, double price, String productName) {
        this.productId = productId;
        this.price = price;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }
}
