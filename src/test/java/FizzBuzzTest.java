import julesnuggy.fizzbuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void returnsNumberAsString() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.calculateOriginal(1));
    }

    @Test
    public void returnsFizz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.calculateOriginal(3));
    }

    @Test
    public void returnsBuzz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.calculateOriginal(5));
    }

    @Test
    public void returnsFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.calculateOriginal(15));
    }

    @Test
    public void returnsBang() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Bang", fb.calculateExtra(7));
    }
}
