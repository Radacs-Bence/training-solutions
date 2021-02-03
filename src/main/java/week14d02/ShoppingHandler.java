package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class ShoppingHandler {

    private Map<String, List<Purchase>> buyers = new HashMap<>();

    public void readFromFile(BufferedReader reader) throws IOException {
        String line = "";
        while ((line = reader.readLine()) != null) {
            parseLine(line);
        }
    }

    private void parseLine(String line) {
        String[] parts = line.split("-|: |,");
        String buyerId = parts[0];
        String purchaseId = parts[1];
        List<Product> products = productsMaker(parts);
        List<Purchase> purchases = new ArrayList<>();
        Purchase newPurchase = new Purchase(purchaseId, products);
        if (!buyers.containsKey(buyerId)) {
            purchases.add(newPurchase);
            buyers.put(buyerId, purchases);
        } else {
            buyers.get(buyerId).add(newPurchase);
        }
    }

    private List<Product> productsMaker(String[] parts) {
        List<Product> products = new ArrayList<>();
        for (int i = 2; i < parts.length; i++) {
            String name = parts[i].substring(0, parts[i].indexOf("("));
            int price = Integer.parseInt(parts[i].substring(parts[i].indexOf("(") + 1, parts.length - 1));
            products.add(new Product(name, price));
        }
        return products;
    }

    public int priceOfPurchase(String purchaseId) {
        int result = 0;
        Purchase searchedPurchase = null;
        for (String buyer : buyers.keySet()) {
            for (Purchase purchase : buyers.get(buyer)) {
                if (purchase.getPurchaseId().equals(purchaseId)) {
                    return spendingOnOnePurchase(purchase);
                }
            }
        }
        return result;
    }

    public int buyerSpending(String buyerId) {
        int result = 0;
        List<Purchase> purchases = buyers.get(buyerId);
        for (Purchase purchase : purchases) {
            result += spendingOnOnePurchase(purchase);
        }
        return result;
    }

    private int spendingOnOnePurchase(Purchase purchase){
        int result = 0;
        for (Product product : purchase.getProducts()) {
            result += product.getPrice();
        }
        return result;
    }

    public List<Product> productsByAlphabet(String purchaseId){
        Purchase purchase = findPurchase(purchaseId);
        List<Product> result = new ArrayList<>(purchase.getProducts());
        result.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return result;
    }

    private Purchase findPurchase(String purchaseId){
        Purchase found = null;
        for (String buyer : buyers.keySet()) {
            for (Purchase purchase : buyers.get(buyer)){
                if (purchase.getPurchaseId().equals(purchaseId)) {
                    found = purchase;
                    return found;
                }
            }
        }
        return found;
    }


    public static void main(String[] args) {
        ShoppingHandler shoppingHandler = new ShoppingHandler();

        shoppingHandler.parseLine("SM123-120: dogfood(900),potato(300),tomato(200),chicken(1300),fish(3000),tuna(1200),pasta(200)");
    }

}
