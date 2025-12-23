package ScenarioBased;

//Shopping cart – product and quantity using Map

import java.util.HashMap;
import java.util.Map;

public class Shopping_Cart {
    public static void main(String[] args) {

        Map<String, Integer> cart = new HashMap<>();

        addProduct(cart, "Laptop", 1);
        addProduct(cart, "Mobile", 2);
        addProduct(cart, "Laptop", 1);
        addProduct(cart, "Headphones", 3);
        addProduct(cart, "Mobile", 1);

        System.out.println(cart);
    }

    static void addProduct(Map<String, Integer> cart, String product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }
}
