package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader reader) throws IOException {
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine())  != null) {
            line = line.trim();
            int number = Integer.parseInt(line);
            for (int i = 0; i < number; i++){
                builder.append("*");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
