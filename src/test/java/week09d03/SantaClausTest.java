package week09d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SantaClausTest {

    @Test
    public void christmasTest(){
        List<Person> goodBoys = new ArrayList<>();
        goodBoys.add(new Person("A", 1));
        goodBoys.add(new Person("B", 14));
        goodBoys.add(new Person("C", 1));
        goodBoys.add(new Person("D", 15));

        SantaClaus santa = new SantaClaus(goodBoys);
        santa.getThroughChimneys();

        assertFalse(goodBoys.get(0).getPresent() == null);
        assertFalse(goodBoys.get(1).getPresent() == null);
        assertFalse(goodBoys.get(2).getPresent() == null);
        assertTrue(goodBoys.get(3).getPresent() == null);

    }

}
