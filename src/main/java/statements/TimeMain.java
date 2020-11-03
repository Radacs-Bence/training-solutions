package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg az első időt, szóközzel elválasztva (óra perc másodperc):");
        int hourFirst = scanner.nextInt();
        int minFirst = scanner.nextInt();
        int secFirst = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Adja meg az második időt, szóközzel elválasztva (óra perc másodperc):");
        int hourSecond = scanner.nextInt();
        int minSecond = scanner.nextInt();
        int secSecond = scanner.nextInt();
        scanner.nextLine();

        Time timeFirst = new Time(hourFirst, minFirst, secFirst);
        Time timeSecond = new Time(hourSecond, minSecond, secSecond);

        System.out.println("1. idő: " + timeFirst.toString() + " = " + timeFirst.getInSeconds() + " másodperc" + "\r\n" +
                "2. idő: " + timeSecond.toString() + " = " + timeSecond.getInSeconds() + " másodperc" + "\r\n" +
                "Első idő korábbi a másodiknál: "+ timeFirst.earlierThan(timeSecond));


    }
}
