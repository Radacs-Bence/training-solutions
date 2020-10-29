package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Név:");
        String inName = scanner.nextLine();
        note.setName(inName);
        System.out.println("Téma:");
        String inTopic = scanner.nextLine();
        note.setTopic(inTopic);
        System.out.println("Jegyzet:");
        String inText = scanner.nextLine();
        note.setText(inText);
        System.out.println(note.getNoteText());
    }
}
