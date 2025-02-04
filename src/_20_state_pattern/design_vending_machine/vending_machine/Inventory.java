package _20_state_pattern.design_vending_machine.vending_machine;

import _20_state_pattern.design_vending_machine.product.Product;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<Product, Integer> map;
    Inventory(){
        map = new HashMap<>();
    }
    public void addProduct(Product product, int quantity){
        map.put(product, quantity);
    }
    public void removeProduct(Product product){
        map.remove(product);
    }
    public void updateQuantity(Product product, int quantity){
        map.put(product, quantity);
    }
    public int getQuantity(Product product){
        return map.getOrDefault(product, 0);
    }
    public boolean isAvailable(Product product){
        return map.getOrDefault(product, 0) > 0;
    }
}
