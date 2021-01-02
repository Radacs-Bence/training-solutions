package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    public static final String SEPARATOR = ";";

    private List<Band> bands = new ArrayList<>();

    public List<Band> getBands() {
        return new ArrayList<>(bands);
    }

    public void readBandsFromFile(Path file) {
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(SEPARATOR);
                bands.add(new Band(parts[0], Integer.parseInt(parts[1])));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not open file!", ioException);
        }
    }

    public void writeBandsBefore(Path file, int year) {
        List<Band> bandsToWrite = findBandsBefore(year);
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            for (Band band : bandsToWrite) {
                writer.write(band.getName() + SEPARATOR + band.getYear() + "\n");
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Can not open file!", ioException);
        }
    }

    public List<Band> findBandsBefore(int year) {
        List<Band> beforeBands = new ArrayList<>();
        for (Band band : bands) {
            if (band.getYear() < year) {
                beforeBands.add(band);
            }
        }
        return beforeBands;
    }
}
