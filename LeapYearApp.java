package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        int daysNonLeap = 0;
        int daysLeap = 0;

        System.out.println("Please insert the year (in numbers):");
        year = sc.nextInt();

        if (year <= 0) {
            System.out.println("please insert another year");
            System.exit(1);
        }
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("the year " + year + " is leap");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
            System.out.println("the year " + year + " is not leap");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("the year " + year + " is leap");
        } else {
            System.out.println("the year " + year + " is not leap");
        }
        System.out.println("thanks for using our application");
    }
}