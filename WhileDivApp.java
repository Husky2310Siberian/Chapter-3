/**package gr.aueb.cf.ch3;

import java.util.Scanner;

public class WhileDivApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("please insert two integers");
            numerator = in.nextInt();
            denominator = in.nextInt();

            if (numerator == 0) {
                System.out.println("numerator should not be  zero");
                break;
            }

            if (denominator == 0) {
                System.out.println("denominator should not be zero");
                continue;
            }
            result = numerator / denominator;
            System.out.printf(" %d / %d = %d \n", numerator, denominator, result);
        }
        System.out.println("thanks for using our app");
    }
}*/