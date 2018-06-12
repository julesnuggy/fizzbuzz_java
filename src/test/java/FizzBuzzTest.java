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

    @Test
    public void returnsFizzBang() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBang", fb.calculateExtra(21));
    }

    @Test
    public void returnsBuzzBang() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("BuzzBang", fb.calculateExtra(35));
    }

    @Test
    public void returnsFizzBuzzBang() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzzBang", fb.calculateExtra(105));
    }

    @Test
    public void assessNumberReturnsNothing() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("", fb.assessNumber(1, 3, "Fizz"));
    }

    public void assessNumberReturnsFizz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.assessNumber(3, 3, "Fizz"));
    }
}
