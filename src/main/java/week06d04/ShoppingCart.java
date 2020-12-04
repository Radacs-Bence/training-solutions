package week06d04;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> shoppingCart = new ArrayList<>();

    public void addItem(String name, int quantity){
        Item item = findItem(name);
        if (item == null){
            shoppingCart.add(new Item(name, quantity));
        } else {
            item.quantityIncrease(quantity);
        }
    }

    public int getItem(String name){
        int quantity = 0;
        if (findItem(name) != null){
            quantity = findItem(name).getQuantity();
        }
        return quantity;
    }

    private Item findItem(String name){
        Item found = null;
        for (Item item: shoppingCart) {
            if (item.getName().equals(name)){
                found = item;
            }
        }
        return found;
    }

}
