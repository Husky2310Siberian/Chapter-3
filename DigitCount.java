package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπολογίζει το πλήθος ενός ακεραίου
 * με do/while
 */
public class DigitCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int num = 0;
            int copyofNum = 0;
            int count = 0;
            int rhdigit = 0;
            int sumofDigits = 0;

        System.out.println("please insert an int");
        num = in.nextInt();

        copyofNum = num;

        do {
            count++;

            rhdigit = copyofNum % 10;
            sumofDigits += rhdigit;

            copyofNum = copyofNum / 10;
            } while (copyofNum != 0);

        System.out.println("digit counts = " + count);
        System.out.println("sum of digits = " + sumofDigits);
    }
}
