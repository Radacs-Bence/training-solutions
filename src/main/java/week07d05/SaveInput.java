package week07d05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveInput {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++){
            System.out.println("Adja meg az " + i + ". sort!");
            String line = scanner.nextLine();
            lines.add(line);
        }
        System.out.println("Adja meg a fájl nevét!");
        String fileName = scanner.nextLine();

        Path path = Path.of(fileName);
        try {
            Files.write(path, lines);
        } catch (IOException ioException) {
            throw new IllegalArgumentException("Nem lehet a fájlt létrehozni!");
        }
    }
}
