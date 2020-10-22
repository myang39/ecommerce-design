import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class Order {
    Map<String, Integer> items = new HashMap<>();
    Double totalPrice;
    static Long orderId;
    private String id;
    private String date;
    Order(Map<String, Integer> items) {
        id = (orderId++).toString();
        Double totalP = 0D;
        for (Map.Entry<String, Integer> item : items.entrySet()) {
            Double singlePrice = Product.getPrice(item.getKey());
            totalPrice += singlePrice * item.getValue();
        }
        //date = Date.valueOf("local");
        this.totalPrice = totalP;
    }
}
