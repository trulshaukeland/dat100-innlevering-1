package no.hvl.dat100.gOB;
import javax.swing.JOptionPane;

public class OddetallUtvelger {

    public static void main(String[] args) {
    
        String nedreGrenseInput = JOptionPane.showInputDialog("Skriv inn nedre grense:");
        String ovreGrenseInput = JOptionPane.showInputDialog("Skriv inn øvre grense:");

        int nedreGrense = Integer.parseInt(nedreGrenseInput);
        int ovreGrense = Integer.parseInt(ovreGrenseInput);

        String resultat = "";

        if (nedreGrense % 2 == 0) {
            nedreGrense++;
        }

        for (int i = nedreGrense; i <= ovreGrense; i += 2) {
            resultat += i + ", ";
        }
        // Fjerner siste ", "
        if (resultat.length() > 0) {
            resultat = resultat.substring(0, resultat.length() - 2);
        }

        JOptionPane.showMessageDialog(null, "Resultat: " + resultat);
    }
}