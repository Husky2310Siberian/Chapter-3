package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπολογίζει το παραγοντικό του n
 * δηλαδή  n! = 1*2*3....*n
 */
public class FactorialApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert the number n: ");
        n = in.nextInt();

        while (i <= n) {
            facto = facto * i;
            i++;
        }
        System.out.printf("%d! = %d", n, facto);
    }
}
