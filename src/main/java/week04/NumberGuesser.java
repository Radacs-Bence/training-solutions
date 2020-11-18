package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = rnd.nextInt(100) + 1;
        System.out.println("Gondoltam egy számra! Hat köröd van hogy kitaláld!");

        int counter = 0;
        boolean correct = false;
        while (counter != 6 && !correct){
            System.out.println("Tippelj! " + (6-counter) + " próbálkozásod van");
            int guess = scanner.nextInt();
            scanner.nextLine();
            if (number > guess){
                System.out.println("Nem talált! Ennél nagyobb!");
                counter++;
            }
            if (number < guess){
                System.out.println("Nem talált! Ennél kisebb!");
                counter++;
            }
            if (number == guess){
                correct = true;
            }
        }
        if (correct){
            System.out.println("Talált! Ügyes vagy!");
        } else {
            System.out.println("Kifutottál a próbálkozásokból! Legközelebb biztos sikerül!");
        }

    }
}
