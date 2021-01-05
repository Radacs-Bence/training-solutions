package week10d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Travel {

    public int getStationWithMax(InputStream inputStream) {
        int maxStation = -1;
        List<Integer> entries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                entries.add(Integer.parseInt(parts[0]));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
        int[] passengers = counter(entries);
        maxStation = max(passengers);
        return maxStation;
    }

    private int[] counter(List<Integer> entries){
        int[] passengers = new int[30];
        for (Integer number : entries) {
            passengers[number]++;
        }
        return passengers;
    }

    private int max (int[] passengers){
        int maxStation = -1;
        int maxPassengers = -1;
        for (int i = 0; i < 30; i++) {
            if (passengers[i] > maxPassengers){
                maxPassengers = passengers[i];
                maxStation = i;
            }
        }
        return maxStation;
    }

}
