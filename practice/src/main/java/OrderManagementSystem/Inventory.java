package OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Product> productList;    //product list in this inventory

    public Inventory() {
        this.productList = new ArrayList<>();
    }

    //add product to inventory
    public void addProduct(Product product, ProductController productController) {
        if (!productController.containsProduct(product)) {
            productController.addProduct(product);
        }
        productList.add(product);
    }

    //remove product from inventory
    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public boolean containProduct(Product product) {
        return productList.contains(product);
    }

    public void display() {
        System.out.println("products in my system are");
        for (Product product:productList
        ) {
            System.out.println(product.getProductName());
        }
    }

}
