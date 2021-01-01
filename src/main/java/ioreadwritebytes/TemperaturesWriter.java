package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesWriter {

    public void writeTemperatures(Temperatures temperatures, String pathString) {
        Path file = Path.of(pathString);
        byte[] bytes = temperatures.getData();
        try {
            Files.write(file, bytes);
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
    }

}
