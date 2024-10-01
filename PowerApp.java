package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπολογίζει το base^power
 * ο χρήστης δίνει τους αριθμούς
 */
public class PowerApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please insert the number: ");
        base = in.nextInt();
        power = in.nextInt();

        while (i <= power) {
            result *=  base;    // result = base * result;
            i++;
        }
        System.out.printf("%d ^ %d = %,d" , base, power, result);
    }
}
