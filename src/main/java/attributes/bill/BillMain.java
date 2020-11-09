package attributes.bill;

public class BillMain {

    public static void main(String[] args) {

        Bill bill = new Bill();

        bill.addItem(new Item("Tej", 3, 240));
        bill.addItem(new Item("Tojás", 10, 20));
        bill.addItem(new Item("Zsemle", 6, 100));
        bill.addItem(new Item("Mosószer", 1, 700));

        System.out.println(bill.calculateTotalPrice(bill.getItems()));

    }

}
