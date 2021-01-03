package ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countryList = new ArrayList<>();

    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }

    public void readFromFile(String file) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                CountryStatistics.class.getResourceAsStream("/" + file)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                countryList.add(new Country(parts[0], Integer.parseInt(parts[1])));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
    }

    public int numberOFCountries() {
        return countryList.size();
    }

    public Country mostBorderCountries() {
        Country mostBorders = new Country("Error", -1);
        for (Country country : countryList) {
            if (country.getBorderCountries() > mostBorders.getBorderCountries()){
                mostBorders = country;
            }
        }
        return mostBorders;
    }

}
