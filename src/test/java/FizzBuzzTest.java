import julesnuggy.fizzbuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void runFizzBuzz1() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.runFizzBuzz(1, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz3() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.runFizzBuzz(3, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz5() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.runFizzBuzz(5, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz15() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.runFizzBuzz(15, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz7() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Bang", fb.runFizzBuzz(7, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz21() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBang", fb.runFizzBuzz(21, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz35() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("BuzzBang", fb.runFizzBuzz(35, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz105() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzzBang", fb.runFizzBuzz(105, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz11() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Bong", fb.runFizzBuzz(11, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz55() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Bong", fb.runFizzBuzz(55, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz13() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fezz", fb.runFizzBuzz(13, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz39() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzFezz", fb.runFizzBuzz(39, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz65() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FezzBuzz", fb.runFizzBuzz(65, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz195() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzFezzBuzz", fb.runFizzBuzz(195, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz143() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FezzBong", fb.runFizzBuzz(143, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz255() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("BuzzFizz", fb.runFizzBuzz(255, true, true, true, true, true, true));
    }

    @Test
    public void runFizzBuzz2431() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("BongFezz", fb.runFizzBuzz(2431, true, true, true, true, true, true));
    }

}
