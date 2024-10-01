package gr.aueb.cf.ch3;

/**
 * υπολογίζει το άθροισμα απο 1+...10
 */

public class Sum10 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum += +i;
            i++;
            //System.out.println("the sum is" + sum);
        }
    }
}