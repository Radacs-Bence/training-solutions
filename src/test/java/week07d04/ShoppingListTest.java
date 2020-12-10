package week07d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingListTest {

    @Test
    public void test(){
        ShoppingList shoppingList = new ShoppingList();
        long sum = shoppingList.calculateSum("src/test/resources/ShoppingList.csv");
        assertEquals(170, sum);
    }
}
