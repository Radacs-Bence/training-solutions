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
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            int[] passengers = new int[30];
            List<Integer> entries = new ArrayList<>();
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                entries.add(Integer.parseInt(parts[0]));
            }
            for (Integer number : entries) {
                passengers[number]++;
            }
            for (int i = 0; i < 30; i++) {
                if (passengers[i] > maxStation){
                    maxStation = passengers[i];
                }
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not read File", ioException);
        }
        return maxStation;
    }

}
