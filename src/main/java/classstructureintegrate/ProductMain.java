package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Termék:");
        String name = scanner.nextLine();
        System.out.println("Ár:");
        int price = scanner.nextInt();
        Product product = new Product(name, price);
        System.out.println(product.getName() + ": " + product.getPrice());
        product.decreasePrice(8);
        System.out.println("Csökkentés!\r\n"+ product.getName() + ": " + product.getPrice());
        product.increasePrice(11);
        System.out.println("Növelés!\r\n" +product.getName() + ": " + product.getPrice());
    }
}
