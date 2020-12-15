package week08d02;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries;


    private void countryStatisticsReader(String path){
        Path file = Path.of(path);
        List<String> lines;
        try {
            lines = Files.readAllLines(file);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        countryMaker(lines);
    }

    private void countryMaker(List<String> lines){
        countries = new ArrayList<>();
        for (String line: lines) {
            String[] parts = line.split(" ");
            countries.add(new Country(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]),Integer.parseInt(parts[3])));
        }
    }

    public List<Country> getCountries() {
        return List.copyOf(countries);
    }

    public Country maxPopulation(){
        Country max = countries.get(0);
        for (Country country: countries) {
            if (max.getPopulation() < country.getPopulation()){
                max = country;
            }
        }
        return max;
    }


}
