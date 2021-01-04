package week10d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HikingFile {

    public static final String SEPARATOR = ", ";

    public VerticalMovement getElevation(InputStream inputStream) {
        VerticalMovement verticalMovement = null;
        List<Double> ascending = new ArrayList<>();
        List<Double> descending = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String previousLine = reader.readLine();
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(SEPARATOR);
                String[] previousParts = previousLine.split(SEPARATOR);
                double difference = Double.parseDouble(previousParts[2]) - Double.parseDouble(parts[2]);
                if (difference > 0) {
                    descending.add(difference);
                } else {
                    ascending.add(Math.abs(difference));
                }
                previousLine = line;
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
        verticalMovement = new VerticalMovement(sum(ascending), sum(descending));
        return verticalMovement;
    }

    private double sum(List<Double> numbers) {
        double sum = 0.0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum;
    }


}
