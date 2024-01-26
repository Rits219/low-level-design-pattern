package OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    List<Product> productList;

    public ProductController() {
        this.productList = new ArrayList<>();
    }

    //add product in system
    public void addProduct(Product product) {
        productList.add(product);
    }

    //remove product from system
    public void removeProduct(Product product) {
        productList.remove(product);
    }

    //get product from system
    public Product getProduct(int productId) {
        for (Product product : productList
        ) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

    public boolean containsProduct(Product product){
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
