package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * υπολογίζει το min με τριαδικό τελεστή
 */
public class TernaryOpApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min  = 0;

        System.out.println("insert two integers");

        num1 = in.nextInt();
        num2 = in.nextInt();

    //    if(num1 < num2 ) {
      //      min = num1;
        //}
    min = (num1 < num2) ? num1 : num2;      // τριαδικός τελεστής , αν το num1 < num2 τότε

        System.out.printf(" the min of (%d , %d) is %d", num1, num2, min);
    }


}
