package week06d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void storeTest(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("a", Category.DAIRY, 1));
        products.add(new Product("b", Category.FROZEN, 1));
        products.add(new Product("c", Category.OTHER, 1));
        products.add(new Product("d", Category.DAIRY, 1));
        products.add(new Product("e", Category.FROZEN, 1));
        products.add(new Product("f", Category.DAIRY, 1));

        assertEquals("Fagyasztott: 2, Tejtermék: 3, Pékáru: 0, Egyébb: 1", new Store(products).getProductsByCategory().toString());
    }

}
