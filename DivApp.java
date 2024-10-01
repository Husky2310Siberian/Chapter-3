package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * απλή διαίρεση με μηδέν
 */
public class DivApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert the numbers");

        numerator = in.nextInt();
        denominator = in.nextInt();

        //error conditions
        if (denominator == 0) {         //παρανομαστής
            System.out.println(" Error. denominator is zero");
            System.exit(1);
        }

        if (numerator == 0 ) {
            System.out.println("Error. numerator is zero");
            System.exit(1);

        }
        result = numerator / denominator;
        System.out.println("result =" +result);
    }
}