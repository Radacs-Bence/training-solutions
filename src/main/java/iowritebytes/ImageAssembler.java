package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageAssembler {

    public void makeImageFile(byte[][] imageParts, Path folder){
        Path file = folder.resolve("image.png");
        try (BufferedOutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(file))) {
            for (byte[] imagePart : imageParts){
                outputStream.write(imagePart);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not write", ioException);
        }
    }

}
