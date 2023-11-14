import static javax.swing.JOptionPane.*;
class oppgave3 {
        public static void main(String[] args){
        String sekunderLest = showInputDialog("Sekunder: "); //Forespør antall sekunder som skal omgjøres
        int sekunderTall = Integer.parseInt(sekunderLest); //Konverterer stringen til en int
        
        int timer = sekunderTall / 3600; //Utnytter heltallsdivisjon for int, som gjør at svaret blir uten desimal
        int minutter = (sekunderTall % 3600) / 60; //Resten av divisjonen fra forrige linje deles på 60 for å se antall minutter
        int sekunder = sekunderTall % 60; //Så kan vi dele resten av input på 60 for å få sekundene som er til overs

        if(sekunderTall < 0){
            showMessageDialog(null, "Feilmelding, tiden må være positiv");
        }
        else{
        showMessageDialog(null, sekunderTall+ " sekunder blir " +timer+ " timer " +minutter+ " minutter og " +sekunder+ " sekunder"); //Skriver ut til bruker
        }
    }    
}
