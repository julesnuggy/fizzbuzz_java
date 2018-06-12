package julesnuggy.fizzbuzz;

import java.util.Collections;
import java.util.ArrayList;

public class FizzBuzz {
    public String assessNumber(int inputNumber, int assessNumber, String outputString) {
        if (inputNumber % assessNumber == 0) {
            return outputString;
        }
        else {
            return "";
        }
    }

    public String runFizzBuzz(int inputNumber) {
        String finalOutput = "";
        ArrayList<String> wordList = new ArrayList<String>();

        if (inputNumber % 11 == 0) {
            wordList.add(this.assessNumber(inputNumber, 13, "Fezz"));
            wordList.add(this.assessNumber(inputNumber, 11, "Bong"));
        }
        else {
            wordList.add(this.assessNumber(inputNumber, 3, "Fizz"));
            wordList.add(this.assessNumber(inputNumber, 13, "Fezz"));
            wordList.add(this.assessNumber(inputNumber, 5, "Buzz"));
            wordList.add(this.assessNumber(inputNumber, 7, "Bang"));
        }

        if (inputNumber % 17 == 0) {
            Collections.reverse(wordList);
        }

        finalOutput = String.join("", wordList);

        if (finalOutput.length() == 0) {
            finalOutput = Integer.toString(inputNumber);
        }

        return finalOutput;
    }
}

