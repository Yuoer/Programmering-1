public class Valuta {

    float valutaKurs;
    String valutaNavn;

    public Valuta(float kurs, String navn) {
        valutaKurs = kurs;
        valutaNavn = navn;
    }

    public static String regnUt(float antall, int fraTil, Valuta valuta) {
        float sum;
        String svar = "";
        if(fraTil == 2){
            sum = valuta.valutaKurs * antall;
            svar = antall + " " + valuta.valutaNavn + " er lik: " + sum + " norske kroner";
        } else if (fraTil == 1) {
            sum = antall / valuta.valutaKurs;
            svar = antall + " norske kroner er lik " + sum + " " + valuta.valutaNavn;
        }
        return svar;
    }
}