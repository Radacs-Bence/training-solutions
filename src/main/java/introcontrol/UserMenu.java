package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása\n" +
                "2. Felhasználó felvétele\n" +
                "Többi: Kilépés");
        String button = scanner.nextLine();

        if ("1".equals(button)){
            System.out.println("Felhasználók listázása");
        } if ("2".equals(button)){
            System.out.println("Felhasználó felvétele");
        }

    }

}
