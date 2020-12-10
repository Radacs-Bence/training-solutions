package week07d04;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {


    public long calculateSum(String path){
        long result = 0;
        try (Scanner scanner = new Scanner(Path.of(path), StandardCharsets.UTF_8)) {
            while(scanner.hasNextLine()) {
                List<String> lines = new ArrayList<>();
                lines.add(scanner.nextLine());
                for (String line: lines) {
                    String[] parts = line.split(";");
                    long amount = Long.parseLong(parts[1]);
                    long price = Long.parseLong(parts[2]);

                    result += amount * price;
                }

            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }

        return result;
    }

    // shoppingList.calculateSum("src/test/resources/ShoppingList.csv")

}
