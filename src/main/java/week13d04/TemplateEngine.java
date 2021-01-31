package week13d04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;

public class TemplateEngine {


    public static final String KEY_START = "{";
    public static final String KEY_END = "}";

    public void merge(BufferedReader reader, Map<String, Object> toChange, BufferedWriter writer) {

        try {
            String line = "";
            while ((line = reader.readLine()) != null) {
                String newLine = lineChanger(line, toChange);
                writeText(newLine, writer);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }

    }

    private String lineChanger(String line, Map<String, Object> toChange) {
        String newLine =  "";
        String key = "";
        if (!line.contains(KEY_START)){
            newLine = line;
        }
        while (line.contains(KEY_START) && line.contains(KEY_END)){
            key = line.substring(line.indexOf(KEY_START) + 1, line.indexOf(KEY_END));
            newLine = line.replace(line.substring(line.indexOf(KEY_START), line.indexOf(KEY_END)+ 1), toChange.get(key).toString());
            line = newLine;
        }
        return newLine;
    }

    private void writeText(String newLine, BufferedWriter writer){
        try{
                writer.write(newLine + "\n");
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file", e);
        }
    }


}
