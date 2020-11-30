package week05d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void productTest (){
        assertEquals(30_000.0, new Product(100, Currency.USD).convertPrice(Currency.HUF));
        assertEquals(300.0, new Product(300, Currency.HUF).convertPrice(Currency.HUF));
        assertEquals(1.0, new Product(300, Currency.HUF).convertPrice(Currency.USD));
    }

}
