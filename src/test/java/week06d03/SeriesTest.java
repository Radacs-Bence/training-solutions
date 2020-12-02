package week06d03;

import immutable.SpaceAgency;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SeriesTest {

    @Test
    public void seriesTest(){
        List<Integer> seriesOne = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> seriesTwo = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> seriesThree = Arrays.asList(1, 2, 6, 4, 5);
        List<Integer> seriesFour = Arrays.asList(1);
        Series series = new Series();

        assertEquals(SeriesType.ASCENDING, series.calculateSeriesType(seriesOne));
        assertEquals(SeriesType.DESCENDING, series.calculateSeriesType(seriesTwo));
        assertEquals(SeriesType.MIXED, series.calculateSeriesType(seriesThree));

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Series().calculateSeriesType(seriesFour));
        assertEquals("The series must contain more than one number!", ex.getMessage());
    }

}
