package numbers;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg az első kör átmérőjét:");
        int diameter1 = scanner.nextInt();
        scanner.nextLine();
        Circle circle1 = new Circle(diameter1);

        System.out.println("Kérem adja meg a második kör átmérőjét:");
        int diameter2 = scanner.nextInt();
        scanner.nextLine();
        Circle circle2 = new Circle(diameter2);

        System.out.println("1. kör kerülete: " + circle1.perimeter()
                + "\n" + "Területe: " + circle1.area()
                + "\n" + "2. kör kerülete: " + circle2.perimeter()
                + "\n" + "Területe: " + circle2.area());
    }
}
