package week12d02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFromFile {

    private int odd = 1;
    private int even = 2;
    public static final String SEPARATOR = " ";
    private List<House> houseList = new ArrayList<>();

    public ReadFromFile(InputStream inputStream) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(SEPARATOR);
                createNewHouse(parts);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot read file", ioException);
        }
    }

    private void createNewHouse(String[] parts) {
        if ("0".equals(parts[0])) {
            houseList.add(new House(even, Integer.parseInt(parts[1]), parts[2]));
            even += 2;
        }
        if ("1".equals(parts[0])) {
            houseList.add(new House(odd, Integer.parseInt(parts[1]), parts[2]));
            odd += 2;
        }
    }

    public List<House> housesByArea() {
        List<House> sorted = new ArrayList<>(houseList);
        Collections.sort(sorted);
        return sorted;
    }

    public int lastNumber() {
        int size = houseList.size();
        return houseList.get(size - 1).getAddress();
    }

    public void writeOddStreetView(Path path) {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(oddsFormList());

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }

    private String oddsFormList() {
        StringBuilder text = new StringBuilder();
        for (House house : houseList) {
            text.append(houseToString(house));
        }
        return text.toString();
    }

    private String houseToString(House house){
        StringBuilder text = new StringBuilder();
        text.append(String.format("(%s)", house.getAddress()));
        for (int i = 0; i < house.getWidth(); i++){
            text.append(house.getFence());
        }
        return text.toString();
    }

    public List<House> getHouseList() {
        return new ArrayList<>(houseList);
    }
}
