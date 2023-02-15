package kata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

    final private List<Product> items = new ArrayList<>();
    public void addItem(Product product) {
        items.add(product);
    }

    public Amount totalAmount() {
       return Amount.of(items.stream().map(item -> item.getUnitPrice().getValue()).reduce(BigDecimal.ZERO, BigDecimal::add).toString());
    }
}
