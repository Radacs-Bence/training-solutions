package week13d01;

import org.junit.jupiter.api.Test;
import week13d04.TemplateEngine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class CitiesTest {

    @Test
    void getFirstByAlphabetTest() {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Cities.class.getResourceAsStream("iranyitoszamok-varosok-2021.csv")));
        Cities cities = new Cities();

        City first = cities.getFirstByAlphabet(bufferedReader);

        assertEquals("8127;Aba;", first.toString());
    }
}