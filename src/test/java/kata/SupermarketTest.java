package kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SupermarketTest {
    @Test
    void test(){
        Product product = new Product("Cane of beans", Amount.of("0.65"));
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.addItem(product);
        shoppingBasket.addItem(product);
        Assertions.assertThat(shoppingBasket.totalAmount()).isEqualTo(Amount.of("1.30"));
    }

}
