import julesnuggy.fizzbuzz.FizzBuzz;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void runFizzBuzz1() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(3);
        assertEquals("1", fb.runFizzBuzz(1, testRules));
    }

    @Test
    public void runFizzBuzz3() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(3);
        assertEquals("Fizz", fb.runFizzBuzz(3, testRules));
    }

    @Test
    public void runFizzBuzz3WithDifferentRule() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(5);
        assertEquals("3", fb.runFizzBuzz(3, testRules));
    }


    @Test
    public void runFizzBuzz5() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(5);
        assertEquals("Buzz", fb.runFizzBuzz(5, testRules));
    }

    @Test
    public void runFizzBuzz15() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(3);
        testRules.add(5);
        assertEquals("FizzBuzz", fb.runFizzBuzz(15, testRules));
    }

    @Test
    public void runFizzBuzz7() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(7);
        assertEquals("Bang", fb.runFizzBuzz(7, testRules));
    }

    @Test
    public void runFizzBuzz21() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(3);
        testRules.add(7);
        assertEquals("FizzBang", fb.runFizzBuzz(21, testRules));
    }

    @Test
    public void runFizzBuzz35() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(5);
        testRules.add(7);
        assertEquals("BuzzBang", fb.runFizzBuzz(35, testRules));
    }

    @Test
    public void runFizzBuzz105() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(3);
        testRules.add(5);
        testRules.add(7);
        assertEquals("FizzBuzzBang", fb.runFizzBuzz(105, testRules));
    }

    @Test
    public void runFizzBuzz11() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(11);
        assertEquals("Bong", fb.runFizzBuzz(11, testRules));
    }

    @Test
    public void runFizzBuzz55() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(5);
        testRules.add(11);
        assertEquals("Bong", fb.runFizzBuzz(55, testRules));
    }

    @Test
    public void runFizzBuzz13() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(13);
        assertEquals("Fezz", fb.runFizzBuzz(13, testRules));
    }

    @Test
    public void runFizzBuzz39() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(3);
        testRules.add(13);
        assertEquals("FizzFezz", fb.runFizzBuzz(39, testRules));
    }

    @Test
    public void runFizzBuzz65() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(5);
        testRules.add(13);
        assertEquals("FezzBuzz", fb.runFizzBuzz(65, testRules));
    }

    @Test
    public void runFizzBuzz195() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(3);
        testRules.add(5);
        testRules.add(13);
        assertEquals("FizzFezzBuzz", fb.runFizzBuzz(195, testRules));
    }

    @Test
    public void runFizzBuzz143() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(11);
        testRules.add(13);
        assertEquals("FezzBong", fb.runFizzBuzz(143, testRules));
    }

    @Test
    public void runFizzBuzz255() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(3);
        testRules.add(5);
        testRules.add(17);
        assertEquals("BuzzFizz", fb.runFizzBuzz(255, testRules));
    }

    @Test
    public void runFizzBuzz2431() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> testRules = new LinkedList<>();
        testRules.add(11);
        testRules.add(13);
        testRules.add(17);
        assertEquals("BongFezz", fb.runFizzBuzz(2431, testRules));
    }

    @Test
    public void setNoRules() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> expectedResult = new LinkedList<>();
        assertThat(expectedResult, is(fb.setRules()));
    }

    @Test
    public void setSingleRule() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> expectedResult = new LinkedList<>();
        expectedResult.add(3);
        assertThat(expectedResult, is(fb.setRules(3)));
    }
    @Test
    public void setManyRules() {
        FizzBuzz fb = new FizzBuzz();
        List<Integer> expectedResult = new LinkedList<>();
        expectedResult.add(3);
        expectedResult.add(5);
        expectedResult.add(7);
        assertThat(expectedResult, is(fb.setRules(3,5,7)));

    }

}
