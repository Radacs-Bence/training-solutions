package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {


    public Temperatures readTemperatures(String pathString) {
        Path file = Path.of(pathString);
        byte[] bytes = null;
        try {
            bytes = Files.readAllBytes(file);
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
        return new Temperatures(bytes);
    }
}
