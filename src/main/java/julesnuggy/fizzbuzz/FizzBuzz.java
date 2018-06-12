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
        String temp, myOutput;
        Boolean tempIsFizzBuzz;

        temp = this.calculateOriginal(myNumber);
        tempIsFizzBuzz = (temp == "Fizz" || temp == "Buzz" || temp == "FizzBuzz") ? true : false;

        if (myNumber % 7 == 0 && !tempIsFizzBuzz) {
            myOutput = "Bang";
        }
        else if (myNumber % 7 == 0 && tempIsFizzBuzz) {
            myOutput = temp + "Bang";
        }
        else {
            myOutput = Integer.toString(myNumber);
        }
        return myOutput;
    }
}

