package javabasics._16;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        System.out.println(celsiusToFahrenheitConverter(47));
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Put this into a function
        double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        // End
        System.out.println(conversionDescription);
    }

    private static String celsiusToFahrenheitConverter(double celsius) {
        double fahrenheit = ((celsius * 9) / 5) + 32;
        return celsius + " Celsius is " + fahrenheit + " fahrenheit";
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            // Call your function
            System.out.println(printNamesInArray(name));
        }
    }

    static String printNamesInArray (String name){
        if (name.trim().matches("[a-zA-Z]+")) {
            return name.trim().toUpperCase();
        } else {
            return "Invalid";
        }
    }


    /**                                             Metodo utilizzato in live coding
    static String printNamesInArray (String name){
        char[] chars = name.toCharArray();
        for (int i = 0 ; i < chars.length ; i++){
            if (Character.isDigit(chars[i])) {
                return "Invalid";
            }
        }
        return name.trim().toUpperCase();
    }
    */

    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        // Call your function
        printLunchInformation(myLunchPrice, lunchType, description, weightInGrams);
        printLunchInformation(17.49,"Hamburger","hamburger vegetariano", 958); //non richiesto, serve a me per testare
    }

    static void printLunchInformation(double price, String lunchType, String description, int weightInGrams){
        System.out.println("This lunch costs:" + price + "\n" + "It consist of :" + lunchType + ", " + description + " and it weights " + weightInGrams + " grams");
    }
}