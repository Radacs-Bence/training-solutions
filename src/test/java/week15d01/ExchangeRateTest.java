package week15d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExchangeRateTest {

    @Test
    void bitcoinTest() {

        List<Integer> input = Arrays.asList(100, 120, 40, 70, 200, 30, 50);

        ExchangeRate exchangeRate = new ExchangeRate();

        assertEquals(160, exchangeRate.bitcoin(input).getDifference());
        assertEquals(40, exchangeRate.bitcoin(input).getBuyDayRate());
        assertEquals(200, exchangeRate.bitcoin(input).getSellDayRate());

    }
}