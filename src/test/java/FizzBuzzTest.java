import julesnuggy.fizzbuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void returnsNumberAsString() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.calculate(1));
    }
}
