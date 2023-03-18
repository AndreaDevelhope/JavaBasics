package javabasics._17;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

import static java.util.Calendar.JANUARY;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        long myBankBalanceEuro = 500l;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;

        //Add the questionable funds to your bank balance and print it out!
        myBankBalanceEuro += questionableFundsEuro;
        System.out.println(myBankBalanceEuro);
     }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age
     *    short -> l'età è sempre un numero intero e potrebbe essere maggiore di 127 quindi escludendo byte, short è il prossimo
     *
     *    2b: The age of a baby in months
     *    byte -> è il type più piccolo
     *
     *    2c: Money in a hedgefund in euros
     *    long -> essenndo un conto speculativo potrebbe contenere enormi somme
     *
     *    2d: Price of a good in euros on amazon.com+
     *    float -> i prodotti amazon non hanno mai più di 2 numeri dopo la virgola
     *
     *    2e: The exact weight of an apple measured by scientific equipment
     *    double -> massima precisione dopo la virgola
     *
     *    2f: The number of kilometers from any 2 places in the world
     *    short -> il massimo valore di short è 32_768 , la circonferenza della terra è di circa 40_000 km ma la distanza tra due punti non supererà mai la sua metà
     *
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");
        LocalDate myDate = LocalDate.of(1998, 12 , 7);
        LocalDate newDate = LocalDate.now();
        System.out.print("Oggi è " + newDate.getDayOfWeek() + " e ");
        switch (newDate.getMonthValue()) {
            case 1 -> System.out.println("siamo a gennaio");
            case 2 -> System.out.println("siamo a febbraio");
            case 3 -> System.out.println("siamo a marzo");
            case 4 -> System.out.println("siamo a aprile");
            case 5 -> System.out.println("siamo a maggio");
            case 6 -> System.out.println("siamo a giugno");
            case 7 -> System.out.println("siamo a luglio");
            case 8 -> System.out.println("siamo a agosto");
            case 9 -> System.out.println("siamo a settembre");
            case 10 -> System.out.println("siamo a ottobre");
            case 11 -> System.out.println("siamo a novembre");
            case 12 -> System.out.println("siamo a dicembre");
            default -> System.out.println("Invalid month");
        }

        if (myDate.isAfter(newDate)) System.out.println(myDate + " è prima di " + newDate);
        else System.out.println(newDate + " è dopo " + myDate);
        System.out.println("Sono nato il " + myDate.getDayOfMonth() + " " + myDate.getMonth() + " ed era un " + myDate.getDayOfWeek());
        int mieiAnni = newDate.getYear() - myDate.getYear();
        if (newDate.getDayOfYear() < myDate.getDayOfYear()) mieiAnni--;   // se è bisestile rischia di non funzionare
        System.out.println("Ho " + mieiAnni + " anni e mancano " + (myDate.getDayOfYear() - newDate.getDayOfYear()) + " giorni al mio compleanno!");
    }
}
