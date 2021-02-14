package week15d05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CovidSum {

    public static final String SEPARATOR = ",";

    public List<CovidCasesPerCountry> count(BufferedReader reader) throws IOException {
        String line;
        reader.readLine();
        Map<String, CovidCasesPerCountry> countries = new HashMap<>();

        while ((line = reader.readLine())  != null) {

            if (line.contains("Bonaire, Saint")){
                line = line.replace("Bonaire, Saint", "Bonaire Saint");
            }
            String[] parts = line.split(SEPARATOR);
            if (!parts[7].isBlank()) {
                String country = parts[4];
                int cases = Integer.parseInt(parts[2]);
                int population = Integer.parseInt(parts[7]);
                if (!countries.containsKey(country)){
                    countries.put(country, new CovidCasesPerCountry(country,population,cases));
                }else {
                    countries.get(country).addCases(cases);
                }
            }

        }
        List<CovidCasesPerCountry> casesList = new ArrayList<>(countries.values());
        Collections.sort(casesList, (o1, o2) -> Double.valueOf(o2.getRate()).compareTo(Double.valueOf(o1.getRate())));
        return casesList.subList(0, 3);
    }


    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/data.csv"))) {
            System.out.println(new CovidSum().count(reader));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }

}