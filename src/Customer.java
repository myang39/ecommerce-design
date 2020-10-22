import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static Long totalId = 0L; // what is overflow
    private String id;
    private String name;
    private Cart cart;
    List<Order> orders;

    Customer(String name) {
        id = (totalId++).toString();
        this.name = name;
        cart = new Cart();
        orders = new ArrayList<>();
    }

    boolean addToCart(String productId, int quantity) {
        return cart.addToCart(productId, quantity);
    }

    boolean removeProduct(String productId) {
        return cart.removeProduct(productId);
    }

    //removeAllProduct
    //call cart.removeAllProducts() directly

    Double checkOut(){
        Order newOrder = new Order(cart.getAllItems());
        orders.add(newOrder);
        return newOrder.totalPrice;

    }


}
