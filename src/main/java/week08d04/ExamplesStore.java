package week08d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ExamplesStore {
    public final static String TITLE = "# ";
    private List<String> titles = new ArrayList<>();


    public void getTitlesOfExamples() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                ExamplesStore.class.getResourceAsStream("examples.md")))) {
            String line = "";
            while (line != null) {
                line = reader.readLine();
                addTitle(line);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Error while reading file!", ioException);
        }

    }

    private void addTitle(String line) {
        if (line != null && line.startsWith(TITLE)) {
            line = line.replace(TITLE, "");
            titles.add(line);
        }
    }

    public List<String> getTitles() {
        return titles;
    }

}
