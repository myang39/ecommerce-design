import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<String, Integer> allItems = new HashMap<>();
    void addProduct(String productId, Integer quantity) {
        allItems.put(productId, quantity);
    }

    Map<String, Integer> getAllItems() {
        return  allItems;
    }

    boolean removeProduct(String productId) {
        //如果不存在，return false;
        Integer quantityInCart = allItems.get(productId);
        Product.setQuantity(productId, quantityInCart);
        return true;
    }

    boolean removeAllProducts() {
        //traverse all products in allItems, call removeProduct() one by one
        return true;
    }

    boolean addToCart(String productId, int quantity) {
        int existQ = Product.getQuantity(productId);
        if (existQ < quantity) {
            return false;
        }
        else{
            Product.setQuantity(productId, -quantity);
            allItems.put(productId, quantity);
            return true;
        }
    }
 }
