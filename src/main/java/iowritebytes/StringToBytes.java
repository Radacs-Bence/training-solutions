package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {

    public static final String IGNORE = "_";

    public void writeAsBytes(List<String> words, Path file) {
        try (BufferedOutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(file))) {
            for (String word : words) {
                if (word.indexOf(IGNORE) != 0){
                    outputStream.write(word.getBytes());
                }
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not write", ioException);
        }
    }

}
