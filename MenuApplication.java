package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuApplication {

    public static void main(String[] args) {

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Εισάγετε την επιλογή σας");
            System.out.println("Επιλέξτε εισαγωγή");
            System.out.println("Επιλέξτε διαγραφή");
            System.out.println("Επιλέξτε Ενημέρωση");
            System.out.println("Επιλέξτε Αναζήτηση");
            System.out.println("Εξοδος");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("1. Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("2. Διαγραφή");
            } else if (choice == 3) {
                System.out.println("3. Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("4. Αναζήτηση");
            } else if (choice == 5) {
                System.out.println("Έξοδος");
            } else {
                System.out.println("Εισάγετε σωστή επιλογή");
            }
        } while (choice != 5);
    }
}