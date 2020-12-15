package week08d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryStatisticsTest {

    CountryStatistics cs = new CountryStatistics();

    @BeforeEach
    public void setup(){
        cs.countryStatisticsReader("countries.txt");
    }

    @Test
    public void readerTest(){
        assertEquals(11, cs.getCountries().size());
    }

    @Test
    public void maxTest(){
        assertEquals("Kongoi_Demokratikus_Koztarsasag", cs.maxPopulation().getCountryName());
    }

}
