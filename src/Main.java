import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // customer
        Customer customer = new Customer("Kevin");
        Map<String, Product> allProducts = Product.getAllProduct();
        customer.addToCart("7", 2);
        customer.addToCart("7", 2);
        customer.removeProduct("6");
        customer.checkOut();
    }
}
