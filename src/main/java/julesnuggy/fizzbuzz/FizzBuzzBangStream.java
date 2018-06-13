package julesnuggy.fizzbuzz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FizzBuzzBangStream {
    public static Stream<String> create() {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
            .stream()
            .forEach(System.out::println);

        return null;
    }
}
