package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Befektetés összege:");
        int investedAmount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kamatláb:");
        int interest = scanner.nextInt();
        scanner.nextLine();

        Investment investment = new Investment(investedAmount, interest);

        System.out.println(
                "Tőke: " + investment.getFund() + "\r\n" +
                "Hozam 50 napra: " + investment.getYield(50) + "\r\n" +
                "Kivett összeg 80 nap után: " + investment.close(80) + "\r\n" +
                "Kivett összeg 90 nap után: " + investment.close(90)
        );
    }
}
