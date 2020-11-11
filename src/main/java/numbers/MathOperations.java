package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        final double MARGIN_OF_ERROR = 0.0001;

        String task = "(9 + 7) / (5 + 1) * 3";

        double result = (9.0 + 7.0) / (5.0 + 1.0) * 3.0; //8

        Scanner scanner = new Scanner(System.in);

        System.out.println("Feladat: " + task);
        double input = scanner.nextDouble();
        scanner.nextLine();
        double difference = Math.abs(result-input);

        if (difference < MARGIN_OF_ERROR){
            System.out.println("Helyes!");
        } else{
            System.out.println("Hibás!");
        }

    }


}
