package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum=0;

        for (int i = 1; i <= 5; i++){

            String text;
            if(i == 1 || i == 5){
                text ="Aja meg az " + i + ". számot";
            } else {
                text ="Aja meg a " + i + ". számot";
            }

            System.out.println(text);
            number = scanner.nextInt();
            scanner.nextLine();
            sum = sum +number;
        }
        System.out.println("\nEredmény: " + sum);
    }

}
