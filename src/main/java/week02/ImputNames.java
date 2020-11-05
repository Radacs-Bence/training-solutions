package week02;

import java.util.Scanner;

public class ImputNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];


        for (int i = 0; i < names.length; i++){

            String text;
            if(i == 0){
                text ="Aja meg az " + (i + 1) + ". nevet";
            } else {
                text ="Aja meg a " + (i + 1) + ". nevet";
            }

            System.out.println(text);
            names[i] = scanner.nextLine();

        }
        for (int i = 0; i < names.length; i++){
            System.out.println((i + 1) + ". név: " + names[i]);
        }
    }
}
