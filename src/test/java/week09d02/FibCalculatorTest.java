package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibCalculatorTest {
    FibCalculator fib = new FibCalculator();

    @Test
    public void fibTest(){
        assertEquals(0, fib.sumEvens(-1));
        assertEquals(2, fib.sumEvens(5));
        assertEquals(10, fib.sumEvens(33));
        assertEquals(44, fib.sumEvens(143));
        assertEquals(188, fib.sumEvens(609));
        assertEquals(798, fib.sumEvens(610));
    }}
