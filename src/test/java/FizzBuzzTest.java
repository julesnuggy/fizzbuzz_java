import julesnuggy.fizzbuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void returnsNumberAsString() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.calculate(1));
    }

    @Test
    public void returnsFizz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.calculate(3));
    }

    @Test
    public void returnsBuzz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.calculate(5));
    }

    @Test
    public void returnsFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.calculate(15));
    }
}
