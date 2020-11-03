package week02;

import java.util.Scanner;

public class Phone {
    /*[15:35] Kristof Barczay (Guest)

week02.Phone
type:String
mem:int
Konstruktor
Getterek/Setterk
main() -> 2 Phone példányt, kírja az adatokat

Bónusz: Felhasználótól kérjük be az adatokat
*/
    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a telefon típusát:");
        String firstType =scanner.nextLine();
        System.out.println("Adja meg a memóriát:");
        int firstMem= scanner.nextInt();
        scanner.nextLine();
        Phone firstPhone = new Phone(firstType, firstMem);

        System.out.println("Adja meg a telefon típusát:");
        String secondType =scanner.nextLine();
        System.out.println("Adja meg a memóriát:");
        int secondMem= scanner.nextInt();
        scanner.nextLine();
        Phone secondPhone = new Phone(secondType, secondMem);

        System.out.println("1.telefon: " + firstPhone.getType() + firstPhone.getMem() + "\r\n" + "2. telefon: " + secondPhone.getType() + secondPhone.getMem());




    }
}
