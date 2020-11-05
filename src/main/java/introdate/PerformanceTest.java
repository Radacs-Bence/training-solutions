package introdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class PerformanceTest {
    public static void main(String[] args) {

        Performance performance = new Performance(LocalDate.of(2018, Month.MAY, 24), "Gabby Moreno",
                                                                LocalTime.of(20, 00), LocalTime.of(22, 00) );

        System.out.println(performance.getInfo());



    }
}
