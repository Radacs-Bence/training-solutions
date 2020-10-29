package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Név:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("E-mail:");
        String eMail = scanner.nextLine();
        System.out.println("Regisztáció sikeres!" + "\r\n" + "Név:" + name + "\r\n" + "E-mail:" + eMail);
    }
}
