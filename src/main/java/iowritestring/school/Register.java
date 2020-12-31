package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {

    public void newMark(Path file, int mark) {
        String textNew = Integer.toString(mark);
        String textExists = mark + "\n";
        try {
            if (Files.exists(file)) {
                Files.writeString(file, textExists, StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, textNew);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not write file", ioException);
        }
    }

    public void average(Path file) {
        List<String> marks = null;
        try {
            marks = Files.readAllLines(file);
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read file", ioException);
        }
        double sum = 0;
        for (String mark : marks) {
            sum += Double.parseDouble(mark);
        }
        double average = sum / marks.size();
        try {
            Files.writeString(file, "average: " + average, StandardOpenOption.APPEND);
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not write file", ioException);
        }


    }


}
