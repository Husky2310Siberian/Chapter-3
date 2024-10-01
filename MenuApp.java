package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * εμφανίζει μενού επιλογών με do/while
 * εκτελείται οπωσδήποτε μια φορά
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("επιλέξτε απο τις παρακάτω CRUD επιλογές");
            System.out.println(" 1. Εισαγωγή προιόντος");
            System.out.println(" 2. ενημέρωση προιόντος");
            System.out.println(" 3. διαγραφή προιόντος");
            System.out.println(" 4. αναζήτηση προιόντος");
            choice = in.nextInt();
        } while ( choice != 0);

        System.out.println("Ευχαριστούμε");
    }
}
