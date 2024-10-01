package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * τα φώτα ενός αυτοκινήτου οταν βρέχει
 * και ταυτόχρονα είτε ειναι σκοτάδι είτε τρέχουμε
 * με ταχύτητα υψηλή
 * ο χρήστης εισάγει τα τρία παραπάνω στοιχέια
 * και το πρόγραμμα εκτυπώνεια αν τα φώτα ανάβουν ή οχι
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean areLightsOn = false;

        System.out.println("Please insert if is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert the speed:");
        speed = in.nextInt();

        isRunning = speed >= MAX_SPEED;
        areLightsOn = isRaining && (isRunning || isDark);

        System.out.println("Are lights on :" + areLightsOn);
    }
}
