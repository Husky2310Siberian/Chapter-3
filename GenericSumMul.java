package gr.aueb.cf.ch3;

import java.util.Scanner;

public class GenericSumMul {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        int n = 0;
        int mul = 1;

        System.out.println("please insert the numbers :");
        n = in.nextInt();

        while(i <= n) {
            sum += i;
            mul *= i;
            i++;
        }
        System.out.printf("Sum = %d  and mul = %d", sum , mul);
    }
}
