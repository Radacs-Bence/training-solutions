package week07d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateTest {

    @Test
    public void newDateWithOf(){
        Date date = Date.of(1848, 3, 15);

        assertEquals(1848, date.getYear());
        assertEquals(3, date.getMonth());
        assertEquals(15, date.getDay());
    }

    @Test
    public void newDateWithWith(){
        Date date = Date.of(1848, 3, 15);
        Date date1 = date.withYear(300);
        Date date2 = date.withMonth(12);
        Date date3 = date.withDay(24);

        assertEquals(300, date1.getYear());
        assertEquals(12, date2.getMonth());
        assertEquals(24, date3.getDay());
    }

    @Test
    public void wrongDate(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> Date.of(2021, 2, 29) );
        assertEquals("Month or day is incorrect: Month: 2, Day: 29 !", ex.getMessage());
    }
}
