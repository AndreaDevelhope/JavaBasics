package javabasics._10;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * AND = &&
     * OR = ||
     * XOR = ^
     */

    /**
     * 1: Using an if statement, print: "Comfortable clothes" if the following conditions are met:
     *
     *    isWarm is true and wearingShorts is true
     *    isWarm is false and wearingShorts is false
     *
     *    If these conditions are not met, print: "Uncomfortable clothes"
     */
    private static void exercise1() {
        System.out.println("\nExercise 1 - Comfortable clothes:");

        double temperatureInCelsius = 25;
        double isWarmTemperatureInCelsius = 20;
        boolean isWarm = temperatureInCelsius >= isWarmTemperatureInCelsius;
        boolean wearingShorts = true;

        if (isWarm == wearingShorts){
            System.out.println("Comfortable clothes");
        } else {
            System.out.println("Uncomfortable clothes");
        }
    }

    /**
     * 2: We are going to automate the club bouncer, write a condition with an if statement with the && (and)
     *    to check if someone is able to enter the club.
     *
     *    Their shoeType must be "fancy" AND they must be over 18 AND they must have at least 10 euros in their pocket
     *
     *    Write 1 if statement that checks all of these, print "Come in" if they meet the condition
     *    or "stay out" if they don't.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2 - Club Bouncer:");
        String shoeType = "fancy";



        int age = 30;
        double eurosInPocket = 7.5;
        double eurosForEntry = 10;

        String acceptedShoe = "fancy";

        if (shoeType.equals(acceptedShoe) && age >= 18 && eurosInPocket >= 10){
            System.out.println("Come in");
        } else {
            System.out.println("Stay out");
        }
    }

    /**
     * 3: Write an if else statement to calculate our grade
     *
     *    If our grade is 90%+ of the total, we print "A"
     *    If our grade is 80%+ of the total, we print "B"
     *    If our grade is 70%+ of the total, we print "C"
     *    If our grade is 60%+ of the total, we print "D"
     *    If our grade is under 60% of the total, we print "F"
     *
     *    If 'isTestRetry' we cap the maximum grade at C
     *
     *    Remember was can use ! to invert the value of a boolean, i.e. true -> false
     */

    // stavo pensando a un modo per usare l'operatore OR e il NOT però mi sembrava ancora più confusionario, se potessimo usare lo switch case sarebbe tutto più chiaro
    private static void exercise3() {
        System.out.println("\nExercise 3 - Test Grader:");
        double ourTestScore = 8;
        double maxTestScore = 10;
        boolean isTestRetry = true;
        double gradePercentage = (ourTestScore / maxTestScore) * 100;
        if (gradePercentage < 60){                                                      // il voto è minore di 60?
            System.out.println("F");                                                    // SI -> voto "F"
        } else if (gradePercentage < 70){                                               // NO -> okkk è maggiore uguale di 60, ma è minore di 70?
            System.out.println("D");                                                    // SI -> voto "D"
        } else if (gradePercentage < 80){                                               // NO -> è maggiore uguale di 70, ma è minore di 80?
            System.out.println("C");                                                    // SI -> voto "C"
        } else if (gradePercentage < 90){                                               // NO -> è maggiore uguale di 80, ma è minore di 90?
            if (isTestRetry){                                                           // SI -> ok quindi è compreso tra 80 e 90, il voto sarebbe "B", ma è un retry?
                System.out.println("C is max for retry, score is:" + gradePercentage);  // SI -> è un retry quindi massimo voto = "C"
            } else {                                                                    // NO -> non è un retry, voto "B"!
                System.out.println("B");
            }
        } else if (isTestRetry){                                                        // non è minore di 90 quindi il voto sarebbe "A", ma è un retry?
            System.out.println("C is max for a retry, score is:" + gradePercentage);    // SI -> è un retry quindi massimo voto = "C"
        } else {                                                                        // NO -> voto "A"
            System.out.println("A");                                   
        }
    }     
   


    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ---------------------------------------------------------------------------------
     *    Write a XOR condition, print "safe" if only one car is driving down the road,
     *    print "CRASH! or No cars" if not.
     *
     *    XOR = ^
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Optional) - One way road:");
        boolean carIsDrivingFromLeftToRight = true;
        boolean carIsDrivingFromRightToLeft = false;

        if (carIsDrivingFromLeftToRight ^ carIsDrivingFromRightToLeft){
            System.out.println("safe");
        } else {
            System.out.println("CRASH! or No cars");
        }
    }
}
