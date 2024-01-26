package OrderManagementSystem;

import java.util.Map;

public class User {
    private int userId;
    private String userName;
    private Cart cart;

    private Address address;

    public Cart getCart() {
        return cart;
    }

    public User(int userId, String userName, Address address) {
        this.userId = userId;
        this.userName = userName;
        this.cart = new Cart();
        this.address=address;
    }

    public int getUserId() {
        return userId;
    }

    public Map<Integer, Integer> getProductIdvsCount() {
        return cart.getProductsFromCart();
    }

    public void updatedProductInCart(int productId, int quantity) {
        cart.updateProductToCart(productId, quantity);
    }
}
