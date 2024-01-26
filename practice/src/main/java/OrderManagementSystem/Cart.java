package OrderManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Integer, Integer> productIdVsCount;

    public Cart() {
        this.productIdVsCount = new HashMap<>();
    }

    public void updateProductToCart(int productId, int quantity) {
        if (quantity == 0) {
            productIdVsCount.remove(productId);
            return;
        }
        productIdVsCount.put(productId, quantity);
    }

    public Map<Integer, Integer> getProductsFromCart() {
        return productIdVsCount;
    }

    public double getTotalItemPrice(ProductController productController) {
        Map<Integer, Integer> productIdVsCountMap = getProductsFromCart();
        double bill = 0;
        for (Integer productId : productIdVsCountMap.keySet()
        ) {
            Product product = productController.getProduct(productId);
            bill = bill + product.getPrice();
        }
        return bill;
    }

}
