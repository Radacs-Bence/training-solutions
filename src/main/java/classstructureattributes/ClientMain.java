package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a nevét:");
        client.name = scanner.nextLine();
        System.out.println("Adja meg a születési évszámát:");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg a címét:");
        client.adress = scanner.nextLine();
        System.out.println("Név: " + client.name + "\r\n" + "Születési év: "+ client.year + "\r\n" + "Cím: "+ client.adress);
    }
}
