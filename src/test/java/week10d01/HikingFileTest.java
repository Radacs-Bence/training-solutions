package week10d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HikingFileTest {

    @Test
    void getElevationTest() {
        HikingFile hikingFile = new HikingFile();
        VerticalMovement verticalMovement = hikingFile.getElevation(HikingFileTest.class.getResourceAsStream("/gpsdata.txt"));

        assertEquals(40, verticalMovement.getAscension());
        assertEquals(30, verticalMovement.getDescent());


    }
}