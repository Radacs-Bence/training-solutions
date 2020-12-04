package week06d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    @Test
    public void shoppingCart(){
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("a", 1);
        cart.addItem("a", 1);
        cart.addItem("b", 1);

        assertEquals(2, cart.getItem("a"));
        assertEquals(1, cart.getItem("b"));
        assertEquals(0, cart.getItem("c"));

    }

}
