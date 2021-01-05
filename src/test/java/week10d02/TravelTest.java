package week10d02;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class TravelTest {

    @Test
    void getStationWithMaxTest() {
        Travel travel = new Travel();
        InputStream inputStream = TravelTest.class.getResourceAsStream("utasadat.txt");

        assertEquals(3, travel.getStationWithMax(inputStream));

    }
}