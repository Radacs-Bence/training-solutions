package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store1 = new Store("Sport szelet");
        Store store2 = new Store("Túró rudi");
        store1.store(6);
        store2.dispatch(9);
        System.out.println("Raktárak:\r\n" + store1.getProduct() +" raktár: " + store1.getStock() + " darab\r\n" + store2.getProduct() +" raktár: " + store2.getStock() + " darab");
        store1.dispatch(4);
        store1.store(21);
        store2.dispatch(3);
        store2.store(300);
        System.out.println("Változás:\r\n" + store1.getProduct() +" raktár: " + store1.getStock() + " darab\r\n" + store2.getProduct() +" raktár: " + store2.getStock() + " darab");

    }
}
