package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mi a kedvenc zeneszámod címe?");
        song.title = scanner.nextLine();
        System.out.println("Ki adja elő?");
        song.band = scanner.nextLine();
        System.out.println("Milyen hosszú? (percben)");
        song.lenght =  scanner.nextInt();
        scanner.nextLine();
        System.out.println(song.band + " - " + song.title +" ("  + song.lenght + " perc)");
    }
}
