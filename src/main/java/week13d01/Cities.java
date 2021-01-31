package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static final String SEPARATOR = ";";
    public static final String HEADER_START = "IRSZ";

    public City getFirstByAlphabet(BufferedReader reader){
        List<City> cities = new ArrayList<>();
        try {
            String line = "";
            while ((line = reader.readLine()) != null) {
                if(!line.startsWith(HEADER_START)){
                    cities.add(parseLine(line));
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }

        cities.sort(new NameComparator());

        return cities.get(0);
    }

    private City parseLine(String line){
        String[] temp = line.split(SEPARATOR);
        String[] parts = temp;
        if(temp.length == 2){
            parts = new String[]{temp[0], temp[1], ""};
        }
        return new City(parts[0], parts[1], parts[2]);
    }

}
