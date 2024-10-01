package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * διαβάζει μια τιμή θερμοκρασία (ακέραιο)
 * απο το standard input, καθώς και μια boolean
 * τιμή, που αντιστοιχεί στο αν βρέχει
 * και αποφασίζει, αν χιονίζει και θερμοκρασία
 * μικρότερη απο το μηδέν
 */

public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowning = false;

        System.out.println("Please insert if it is raining :" );
        isRaining = in.nextBoolean();

        System.out.println("Please insert outside temperature: ");
        temp = in.nextInt();

        isSnowning = isRaining && (temp < 0);

        System.out.println("is snowing : " + isSnowning);
    }
}
