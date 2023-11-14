import static javax.swing.JOptionPane.*;
class oppgave2_2 {
    public static void main(String[] args){
        int vektKjottdeig1 = 500; //Setter pris og vekt på kjøttdeig
        double prisKjottdeig1 = 39.50;
        int vektKjottdeig2 = 500;
        double prisKjottdeig2 = 39.50;

        double prisforhold1 = vektKjottdeig1 / prisKjottdeig1; //Finner forholdet mellom vekt og pris
        double prisforhold2 = vektKjottdeig2 / prisKjottdeig2;

        if(prisforhold1 < prisforhold2){ //Om kjøttdeig 1 har lavest pris per gram skrives denne ut
            showMessageDialog(null, "Kjøttdeig nr. 1 er billigst, den koster " +String.format("%.2f", prisforhold1)+ " kr per gram");

        } else if(prisforhold1 > prisforhold2){ //Om kjøttdeig 2 har lavest pris per gram skrives denne ut
            showMessageDialog(null, "Kjøttdeig nr. 2 er billigst, den koster " +String.format("%.2f", prisforhold2)+ " kr per gram");

        } else{ //Om ingen av de forrige stemmer argumentene stemmer må prisen være den samme per gram og brukeren får beskjed om det
            showMessageDialog(null, "Kjøttdeigene koster like mye per gram");    
        }
        
    }
    
}
