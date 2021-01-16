package iofiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Installer {

    public static final String FOLDER_SIGN = "/";

    public void install(String folder) {
        Path path = Path.of(folder);
        if (!Files.exists(path) && !Files.isDirectory(path)) {
            throw new IllegalArgumentException("The given directory doesn't exist");
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/install/install.txt")))) {
            String line;
            while ((line = br.readLine()) != null){
                if (line.endsWith(FOLDER_SIGN)){
                    Files.createDirectories(path.resolve(line));
                } else {
                    Files.copy(this.getClass().getResourceAsStream("/install/" + line), path.resolve(line), StandardCopyOption.REPLACE_EXISTING);
                }
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not write", ioException);
        }
    }


}
