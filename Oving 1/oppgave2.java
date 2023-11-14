import static javax.swing.JOptionPane.*;
class oppgave2 {
    public static void main(String[] args){
        String timerLest = showInputDialog("Timer: "); //Ber om antall timer, minutter og sekunder som skal omgjøres
        String minutterLest = showInputDialog("Minutter: ");
        String sekunderLest = showInputDialog("Sekunder: ");
        int timer = Integer.parseInt(timerLest); //Gjør stringen innskrevet fra bruker om til int
        int minutter = Integer.parseInt(minutterLest);
        int sekunder = Integer.parseInt(sekunderLest);
        
        int timerTilSekunder = 3600; //Lager en konstant for omgjøringsforholdet fra timer til sekunder og minutter til sekunder
        int minutterTilSekunder = 60;
    
        int omgjoring = (timer * timerTilSekunder) + (minutter * minutterTilSekunder) + sekunder; //Regner timene og minuttene til sekunder og plusser på sekunder

        if(timer < 0 || minutter < 0 || sekunder < 0){
            showMessageDialog(null, "Feilmelding, tiden må være positiv");
        }
        else{
            showMessageDialog(null, timer+ " timer " +minutter+ " minutter og " +sekunder+ " sekunder blir " +omgjoring+ " sekunder"); //Skriver ut svaret til bruker
        }
    }    
}