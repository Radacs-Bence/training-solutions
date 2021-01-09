package iozip.names;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EmployeeFileManager {

    public void saveEmployees(Path file, List<String> names) {
        try (ZipOutputStream outputStream = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(file)))) {
            outputStream.putNextEntry(new ZipEntry("names.dat"));
            for (String name : names) {
                outputStream.write(name.getBytes());
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not write file", ioException);
        }

    }
}
