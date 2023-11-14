import static javax.swing.JOptionPane.*;

class oppgave1 {
  public static void main(String[] args) {
    String tommerLest = showInputDialog("Tommer: "); //Spør om input fra bruker
    double tommer = Double.parseDouble(tommerLest); //Gjør stringen fra svaret om til en double
    double tommerTilCentimeter = 2.54; //Lager en konstant for forholdet mellom tommer og centimeter
    
    double omgjoring = tommer * tommerTilCentimeter; //Omgjør tommer til centimeter

    showMessageDialog(null, tommer + " tommer er " + omgjoring + " centimeter"); //Skriver ut svaret i en tekstboks
  }
}