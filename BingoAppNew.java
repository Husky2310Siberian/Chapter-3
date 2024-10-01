package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BingoAppNew {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECRET = 30;
        int num = 0;

        while (true) {
            System.out.println("please insert and guess");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("BINGO!!");
                break;
            }   else {
                System.out.println("try again ");
            }
        }
        System.out.println("thank you");
    }
}
