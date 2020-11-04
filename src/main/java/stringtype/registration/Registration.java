package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidator userVal = new UserValidator();

        System.out.println("Adja meg a felhasználónevet:");
        String username = scanner.nextLine();
        System.out.println(userVal.isValidUsername(username)? "Elfogadva!": "Helytelen felhasználónév");

        System.out.println("Adjon meg jelszavat:");
        String password1 = scanner.nextLine();
        System.out.println("Ismételje meg a jelszavat");
        String password2 = scanner.nextLine();
        System.out.println(userVal.isValidPassword(password1, password2)? "Elfogadva!": "Helytelen jeszó");

        System.out.println("Adja meg a E-mail címét:");
        String email = scanner.nextLine();
        System.out.println(userVal.isValidEmail(email)? "Elfogadva!": "Helytelen E-mail cím");

    }
}
