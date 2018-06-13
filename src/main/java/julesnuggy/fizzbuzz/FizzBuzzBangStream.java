package julesnuggy.fizzbuzz;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class FizzBuzzBangStream {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();

        Stream<Integer> infiniteIntegers = Stream.iterate(1, inputValue -> inputValue + 1);
        List<Integer> allRules = new LinkedList<>();
        allRules.add(3);
        allRules.add(5);
        Stream<String> infiniteFizzBuzz = infiniteIntegers.map(integer -> fb.runFizzBuzz(integer, allRules));
        infiniteFizzBuzz.limit(20).forEach(string -> System.out.println(string));
    }
}
