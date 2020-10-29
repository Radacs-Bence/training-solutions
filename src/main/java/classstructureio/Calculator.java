package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Write two numbers with space between them: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        scanner.nextLine();
        int sum = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + "!");
        System.out.println("(" + sum + ")!");
    }
}
