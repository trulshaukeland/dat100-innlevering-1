package no.hvl.dat100;

import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Skriv inn poengsum for student " + (i + 1) + ": ");
                try {
                    int poengsum = Integer.parseInt(scanner.nextLine());

                    if (poengsum < 0 || poengsum > 100) {
                        System.out.println("Ugyldig poengsum. Vennligst skriv inn en verdi mellom 0 og 100.");
                    } else {
                        char karakter = (poengsum >= 90) ? 'A' :
                                        (poengsum >= 80) ? 'B' :
                                        (poengsum >= 60) ? 'C' :
                                        (poengsum >= 50) ? 'D' :
                                        (poengsum >= 40) ? 'E' : 'F';
                        System.out.println("Karakter: " + karakter);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ugyldig input. Vennligst skriv inn et gyldig heltall.");
                }
            }
        }

        scanner.close();
    }
}