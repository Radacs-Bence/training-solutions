package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int seats = 10;

        System.out.println("Adja meg az érkezők számát:");
        int arrivals = scanner.nextInt();
        scanner.nextLine();

        if (arrivals > 3){
            System.out.println("5 fős csónak kivéve");
            arrivals = arrivals - 5;
            seats = seats - 5;

        }if (arrivals > 2){
            System.out.println("3 fős csónak kivéve");
            arrivals = arrivals - 3;
            seats = seats - 3;

        } if (arrivals > 0){
            System.out.println("2 fős csónak kivéve");
            arrivals = arrivals - 2;
            seats = seats - 2;

        } if (arrivals > 0){
            System.out.println(arrivals + " fő a parton maradt");

        } else{
            System.out.println(seats + " hely maradt");
        }


    }
}
