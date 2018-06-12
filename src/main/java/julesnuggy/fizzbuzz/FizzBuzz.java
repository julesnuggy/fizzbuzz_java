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
        Boolean tempIsFizzBuzz;

        originalOutput = this.calculateOriginal(myNumber);
        tempIsFizzBuzz = (originalOutput == "Fizz" || originalOutput == "Buzz" || originalOutput == "FizzBuzz") ? true : false;

        if (myNumber % 7 == 0 && !tempIsFizzBuzz) {
            myOutput = "Bang";
        }
        else if (myNumber % 7 == 0 && tempIsFizzBuzz) {
            myOutput = originalOutput + "Bang";
        }
        else {
            myOutput = originalOutput;
        }
        return myOutput;
    }
}

