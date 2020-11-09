package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    List<Item> items  = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        getItems().add(item);
    }

    public double calculateTotalPrice(List<Item> items){
        double sum = 0;
        for (Item item: items) {
            double price = item.getPrice();
            double quantity = item.getQuantity();
            sum += price*quantity;
        }
        return sum;
    }

}
