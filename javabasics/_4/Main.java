package javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int myAge = 24;
        System.out.println("My age is " + myAge);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char myInitial = 'A';
        int myAge = 24;
        System.out.println("My age=" + myAge +", my initial=" + myInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        // print the sentence "Exercise 3:"
        System.out.println("\nExercise 3:");
        // initializing a new variable for hasEatenLunch as boolean and giving it the value "false"
        boolean hasEatenLunch = false;
        // initializing a new variable for the lunch price as a double and giving it the value 5.99
        double lunchCost = 5.99;
        //prints out "Lunch cost=" followed by the value of the variable lunchCost
        System.out.println("Lunch cost=" + lunchCost);
        //prints out Has Eaten lunch= followed by the value of the variable hasEatenLunch
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}