package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = rnd.nextInt(100) + 1;
        System.out.println("Gondoltam egy számra");

        boolean correct = false;
        while (!correct){
            System.out.println("Tippelj!");
            int guess = scanner.nextInt();
            scanner.nextLine();
            if (number > guess){
                System.out.println("Nem talált! Ennél nagyobb!");
            }
            if (number < guess){
                System.out.println("Nem talált! Ennél kisebb!");
            }
            if (number == guess){
                System.out.println("Talált! Ügyes vagy!");
                correct = true;
            }
        }

    }
}
