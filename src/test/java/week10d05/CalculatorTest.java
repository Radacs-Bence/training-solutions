package week10d05;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void findMinMaxSumTest() {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;

        System.setOut(ps);
        Calculator calculator = new Calculator();
        int[] arr = {1, 2, 3, 4, 5};
        calculator.findMinMaxSum(arr);
        System.out.flush();
        System.setOut(old);

        assertEquals("Minimum: 6, Maximum: 16", baos.toString());

    }
}