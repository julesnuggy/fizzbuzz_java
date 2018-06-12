import julesnuggy.fizzbuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void assessNumberReturnsNothing() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("", fb.assessNumber(1, 3, "Fizz"));
    }

    @Test
    public void assessNumberReturnsFizz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.assessNumber(3, 3, "Fizz"));
    }

    @Test
    public void assessNumberReturnsBuzz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.assessNumber(5, 5, "Buzz"));
    }

    @Test
    public void assessNumberReturnsBang() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Bang", fb.assessNumber(7, 7, "Bang"));
    }

    @Test
    public void runFizzBuzz1() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.runFizzBuzz(1));
    }

    @Test
    public void runFizzBuzz3() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.runFizzBuzz(3));
    }

    @Test
    public void runFizzBuzz5() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.runFizzBuzz(5));
    }

    @Test
    public void runFizzBuzz15() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.runFizzBuzz(15));
    }

    @Test
    public void runFizzBuzz7() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Bang", fb.runFizzBuzz(7));
    }

    @Test
    public void runFizzBuzz21() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBang", fb.runFizzBuzz(21));
    }

    @Test
    public void runFizzBuzz35() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("BuzzBang", fb.runFizzBuzz(35));
    }

    @Test
    public void runFizzBuzz105() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzzBang", fb.runFizzBuzz(105));
    }

    @Test
    public void runFizzBuzz11() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Bong", fb.runFizzBuzz(11));
    }

    @Test
    public void runFizzBuzz55() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Bong", fb.runFizzBuzz(55));
    }

    @Test
    public void runFizzBuzz13() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fezz", fb.runFizzBuzz(13));
    }

    @Test
    public void runFizzBuzz39() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzFezz", fb.runFizzBuzz(39));
    }

    @Test
    public void runFizzBuzz65() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FezzBuzz", fb.runFizzBuzz(65));
    }

    @Test
    public void runFizzBuzz195() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzFezzBuzz", fb.runFizzBuzz(195));
    }

    @Test
    public void runFizzBuzz143() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FezzBong", fb.runFizzBuzz(143));
    }
}
