import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Product {
    private static Long totalId = 0L;
    static Map<String, Product> allProducts = new HashMap<>(); // <id, product>
    private String id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity = 0;

    Product(String name, String description, Integer initialQuantity, Double price) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = initialQuantity;
        id = (totalId++).toString();
    }

    static Map<String, Product> getAllProduct() {
        return allProducts;
    }

    static void addProduct(Product p) {
        allProducts.put(p.id, p);
    }

    static Integer getQuantity(String productId) {
        Product p = allProducts.get(productId);
        if (p == null) {
            return null;
        }
        else{
            return p.quantity;
        }
    }

    static Double getPrice(String productId) {
        Product p = allProducts.get(productId);
        if (p == null) {
            return null;
        }
        else{
            return p.price;
        }
    }

    static void setQuantity(String productId, Integer quantityChange) {
        Product p = allProducts.get(productId);
        if (p != null) {
            p.quantity += quantityChange;
        }
    }


}
