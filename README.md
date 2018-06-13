# fizzbuzz_java

## Introduction
This is a Java implementation of the classic FizzBuzz challenge. A TDD approach was adopted in its development.

This app was created using the IntelliJ IDE, implementing the Maven Framework and using the JUnit4 test framework.

## Logic
The app runs in the command line and will print numbers from 1 up to the user-defined upper limit. Six rules have been implemented:
* If a number is a multiple of 3, print "Fizz" instead of the number. 
* If a number is a multiple of 5 print "Buzz" instead of the number.
    * For numbers which are multiples of both three and five print "FizzBuzz" instead of the number.
* If a number is a multiple of 7, print "Bang" instead of the number. 
    * For numbers which are multiples of seven and three / five, append Bang to what you'd have printed anyway. (E.g. 3 * 7 = 21: "FizzBang").
* If a number is a multiple of 11, print "Bong" instead of the number. Do not print anything else in these cases. (E.g. 3 * 11 = 33: "Bong")
* If a number is a multiple of 13, print "Fezz" instead of the number. 
    * For multiples of most other numbers, the Fezz goes immediately in front of the first thing beginning with B, or at the end if there are none. (E.g. 5 * 13 = 65: "FezzBuzz", 3 * 5 * 13 = 195: "FizzFezzBuzz"). Note that Fezz should be printed even if Bong is also present (E.g. 11 * 13 = 143: "FezzBong")
* If a number is a multiple of 17, reverse the order in which any fizzes, buzzes, bangs etc. are printed. (E.g. 3 * 5 * 17 = 255: "BuzzFizz")

## Use

To run the tests, run `FizzBuzzTest`.

To run the main program, run `Main.main()`.
* You will be prompted to enter the upper limit to run FizzBuzz up to.
    * `255` is advised as the upper limit if you wish to see all rules implemented fully.
* You will be prompted whether or not you wish to use a custom-defined set of rules.
    * If `N`, then all rules as outlined above will be used.
    * If `Y`, then you will need to input a non-spaced, comma-separated list of the rules to apply. For example, `3,7,11` will only apply rules for numbers which are multiples of 3, 7 and 11. 

To run the Stream implementation, run `FizzBuzzBangStream.main()`.