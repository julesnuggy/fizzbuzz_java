package julesnuggy.fizzbuzz;

public class FizzBuzz {

    public String calculateOriginal(int myNumber) {
        String myOutput;
        if ((myNumber % 3) == 0 && (myNumber % 5) != 0) {
            myOutput = "Fizz";
        }
        else if ((myNumber % 3) != 0 && (myNumber % 5) == 0) {
            myOutput = "Buzz";
        }
        else if ((myNumber % 3) == 0 && (myNumber % 5) == 0) {
            myOutput = "FizzBuzz";
        }
        else {
            myOutput = Integer.toString(myNumber);
        }

        return myOutput;
    }

    public String calculateExtra(int myNumber) {
        String originalOutput, myOutput;
        Boolean outputIsFizzBuzz;

        originalOutput = this.calculateOriginal(myNumber);
        outputIsFizzBuzz = originalOutput.equals("Fizz")||originalOutput.equals("Buzz")||originalOutput.equals("FizzBuzz");

        if (myNumber % 7 == 0 && !outputIsFizzBuzz) {
            myOutput = "Bang";
        }
        else if (myNumber % 7 == 0 && outputIsFizzBuzz) {
            myOutput = originalOutput + "Bang";
        }
        else {
            myOutput = originalOutput;
        }
        return myOutput;
    }
}

