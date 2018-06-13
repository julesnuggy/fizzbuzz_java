package julesnuggy.fizzbuzz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {
    public String runFizzBuzz(int inputNumber, Boolean rule3, Boolean rule5, Boolean rule7, Boolean rule11,
                              Boolean rule13, Boolean rule17) {
        String finalOutput = "";
        List<String> wordList = new ArrayList<String>();

        if (inputNumber % 11 == 0) {
            wordList.add(this.evaluateOutput(inputNumber, 13, "Fezz", rule13));
            wordList.add(this.evaluateOutput(inputNumber, 11, "Bong", rule11));
        } else {
            wordList.add(this.evaluateOutput(inputNumber, 3, "Fizz", rule3));
            wordList.add(this.evaluateOutput(inputNumber, 13, "Fezz", rule13));
            wordList.add(this.evaluateOutput(inputNumber, 5, "Buzz", rule5));
            wordList.add(this.evaluateOutput(inputNumber, 7, "Bang", rule7));
        }

        if (inputNumber % 17 == 0 && rule17 == true) {
            Collections.reverse(wordList);
        }

        finalOutput = String.join("", wordList);

        if (finalOutput.length() == 0) {
            finalOutput = Integer.toString(inputNumber);
        }

        return finalOutput;
    }

    private String evaluateOutput(int inputNumber, int assessNumber, String outputString, Boolean ruleActive) {
        if (inputNumber % assessNumber == 0 && ruleActive == true) {
            return outputString;
        } else {
            return "";
        }
    }
}

