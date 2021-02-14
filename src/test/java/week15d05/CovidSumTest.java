package week15d05;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CovidSumTest {

    @Test
    void countTest() {
        List<CovidCasesPerCountry> result = null;
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src/main/resources/data.csv"))) {
            result = new CovidSum().count(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        assertEquals("Montenegro", result.get(2).getCountry());
    }
}