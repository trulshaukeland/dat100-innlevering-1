package no.hvl.dat100.gOB;
import javax.swing.JOptionPane;

public class SirkelAreal {

  public static void main(String[] args) {

      String fortekst = "Areal av en sirkel med radius ";

      double pi = Math.PI;

      String radiustext = JOptionPane.showInputDialog("Angi radius:");

      int radius = Integer.parseInt(radiustext);
      double areal = pi * radius * radius;

      String respons = fortekst + "er " + areal;

      JOptionPane.showMessageDialog(null,respons);
    }
}
