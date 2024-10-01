package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * συνεχίζει το διάβασμα μέχρι να δοθεί μια ειδική
 * τιμή (αρνητική)
 */

public class SentinelApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("please insert a number:");
        //num = in.nextInt();

        while ((num = in.nextInt()) != -1) {
            iterations++;
            System.out.println("please insert a number -1 (for exit):");
            //num = in.nextInt();
        }
        System.out.println("positive counts = " + iterations);
    }
}