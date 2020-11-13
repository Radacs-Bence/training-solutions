package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {

    @Test
    public void testGreet() {
        Greetings greetings = new Greetings();
        assertEquals("Jó éjt!", greetings.greetingByTime(4, 30));
        assertEquals("Jó éjt!", greetings.greetingByTime(5, 0));
        assertEquals("Jó reggelt!", greetings.greetingByTime(5, 1));
        assertEquals("Jó reggelt!", greetings.greetingByTime(9, 0));
        assertEquals("Jó napot!", greetings.greetingByTime(9, 1));
        assertEquals("Jó napot!", greetings.greetingByTime(18, 30));
        assertEquals("Jó estét!", greetings.greetingByTime(18, 31));
        assertEquals("Jó estét!", greetings.greetingByTime(20, 0));
        assertEquals("Jó éjt!", greetings.greetingByTime(20, 1));
    }
}
