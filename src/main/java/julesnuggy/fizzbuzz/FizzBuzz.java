package julesnuggy.fizzbuzz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    public List<Integer> setRules(int ... ruleNumber) {
        List<Integer> rulesList = new LinkedList<>();

        for (int i: ruleNumber) {
            rulesList.add(i);
        }
        return rulesList;
    }

    public String runFizzBuzz(int inputNumber, List<Integer> rulesToApply) {
        String finalOutput = "";
        List<String> wordList = new ArrayList<String>();

        if (inputNumber % 11 == 0) {
            wordList.add(this.evaluateOutput(inputNumber, 13, "Fezz", rulesToApply));
            wordList.add(this.evaluateOutput(inputNumber, 11, "Bong", rulesToApply));
        } else {
            wordList.add(this.evaluateOutput(inputNumber, 3, "Fizz", rulesToApply));
            wordList.add(this.evaluateOutput(inputNumber, 13, "Fezz", rulesToApply));
            wordList.add(this.evaluateOutput(inputNumber, 5, "Buzz", rulesToApply));
            wordList.add(this.evaluateOutput(inputNumber, 7, "Bang", rulesToApply));
        }

        if (inputNumber % 17 == 0 && rulesToApply.contains(17)) {
            Collections.reverse(wordList);
        }

        finalOutput = String.join("", wordList);

        if (finalOutput.length() == 0) {
            finalOutput = Integer.toString(inputNumber);
        }

        return finalOutput;
    }

    private String evaluateOutput(int inputNumber, int ruleNumber, String outputString, List<Integer> ruleActive) {
        if (inputNumber % ruleNumber == 0 && ruleActive.contains(ruleNumber)) {
            return outputString;
        } else {
            return "";
        }
    }
}

