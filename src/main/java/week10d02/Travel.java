package week10d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Travel {

    public static final String SEPARATOR = " ";
    public static final int STATION_INDEX = 0;
    public static final int STATIONS = 30;

    public int getStationWithMax(InputStream inputStream) {
        int maxStation = -1;
        List<Integer> entries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(SEPARATOR);
                entries.add(Integer.parseInt(parts[STATION_INDEX]));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
        int[] passengers = counter(entries);
        maxStation = max(passengers);
        return maxStation;
    }

    private int[] counter(List<Integer> entries){
        int[] passengers = new int[STATIONS];
        for (Integer number : entries) {
            passengers[number]++;
        }
        return passengers;
    }

    private int max (int[] passengers){
        int maxStation = 0;
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] > passengers[maxStation]){
                maxStation = i;
            }
        }
        return maxStation;
    }

}
