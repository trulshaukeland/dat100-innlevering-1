package no.hvl.dat100.gOB;

import javax.swing.JOptionPane;

public class EksponentBeregning {
    
    public static void main(String[] args) {
        String grunnTall = JOptionPane.showInputDialog("Skriv inn grunntallet: ");
        double g = Double.parseDouble(grunnTall);
        
        String eksponentTall = "";
        int e = 0;
        boolean validExponent = false;
        
        while (!validExponent) {
            eksponentTall = JOptionPane.showInputDialog("Skriv inn eksponenten: ");
            try {
                e = Integer.parseInt(eksponentTall);
                validExponent = true; // Hvis konvertering til heltall er vellykket, avslutt while loop
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ugyldig eksponentformat. Vennligst skriv inn et gyldig heltall for eksponenten.");
            }
        }
        
        double resultat1 = Math.pow(g, e);
        double resultat = 1;
        int originalE = e; // Lagrer original eksponent for å bruke i while loop

        while (e != 0) {
            resultat *= g;
            e--;
        }
        System.out.println("Resultatet ved bruk av Math.pow med " + grunnTall + " opphøyd i " + eksponentTall + " er " + resultat1);
        System.out.println("Resultatet ved bruk av while loop med " + grunnTall + " opphøyd i " + originalE + " er " + resultat);
    }
}