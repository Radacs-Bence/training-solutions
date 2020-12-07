package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void fibTest(){
        assertEquals(0, fibonacci.fib(0));
        assertEquals(1, fibonacci.fib(1));
        assertEquals(3, fibonacci.fib(4));
        assertEquals(13, fibonacci.fib(7));
    }

    @Test
    public void bonusTest(){
        assertEquals(0, fibonacci.fibBonus(0));
        assertEquals(1, fibonacci.fibBonus(1));
        assertEquals(2, fibonacci.fibBonus(3));
        assertEquals(13, fibonacci.fibBonus(7));
    }

    @Test
    public void bonusEx(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> fibonacci.fibBonus(-5));
        assertEquals("Index cannot be negative!", ex.getMessage());
    }
}
