import static javax.swing.JOptionPane.*;
class oppgave2_1 {
        public static void main(String[] args){
        String aarLest = showInputDialog("Årstall du vil sjekke for skuddår: ");
        int aarTall = Integer.parseInt(aarLest);

        int tall = aarTall % 4;
        int aarhundre = aarTall % 100;

        if(aarhundre == 0 && aarTall % 400 != 0){
            showMessageDialog(null, "Året " +aarTall+ " er ikke et skuddår");
        } else if(tall != 0){
            showMessageDialog(null, "Året " +aarTall+ " er ikke et skuddår");
        } 
        else{
            showMessageDialog(null, "Året " +aarTall+ " er et skuddår");
        }
    }    
}