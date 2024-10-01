package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * η εφαρμογή λαμβάνει true/false απο το
 * standard input για δύο δεξαμενές. Αν και οι δύο
 * έχουν λιγότερο απο το 1/4 ανάβει κόκκινο, αν η μία
 * έχει λιγότερο απο το 1/4 ανάβει πορτοκαλί ένδειξη
 */

public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLTQTank1 = false;
        boolean isLTQTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert if tank1 is LT quarter :");
        isLTQTank1 = in.nextBoolean();

        System.out.println("Please insert if tank2 is LT quarter :");
        isLTQTank2 = in.nextBoolean();

        isRed = isLTQTank1 && isLTQTank2;
        isOrange = isLTQTank1 ^ isLTQTank2 ;

        System.out.println("the final status is:" + isOrange);

    }
}
