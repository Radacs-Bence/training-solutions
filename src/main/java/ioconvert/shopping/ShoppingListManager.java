package ioconvert.shopping;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListManager {

    public void saveShoppingList(OutputStream outputStream, List<String> shoppingList) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream))) {
            for (String item : shoppingList) {
                writer.write(item);
                writer.newLine();
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not write file", ioException);
        }
    }

    public List<String> loadShoppingList(InputStream inputStream) {
        List<String> shoppingList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                shoppingList.add(line);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read file", ioException);
        }
        return shoppingList;
    }
}
