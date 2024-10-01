package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 */
public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;
        boolean isBingo = false;

        do{
            System.out.println("insert the num");
            num = in.nextInt();

            if (num == SECRET) {
            System.out.println("BINGO");
            isBingo = true;
            } else {
            System.out.println("try again");
            }
        }   while (!isBingo);
    }
}