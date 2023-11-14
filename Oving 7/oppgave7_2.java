public class oppgave7_2 {
    public static void main(String[] args){
        Tekstbehandling tekst1 = new Tekstbehandling("jeg heter august. jeg sier hei. når jeg sier hei endrer det seg til halla.");

        System.out.println("Antall ord i teksten er: " +tekst1.antallOrd());
        System.out.println("Gjennomsnittlig lengde på ordene er: " +tekst1.gjennomsnittligOrdlengde());
        System.out.println("Gjennomsnittlig ord per periode er: " +tekst1.antallOrdPP());
        System.out.println("Ny setning blir: " +tekst1.bytteUtOrd("hei", "halla"));
        System.out.println("Den originale teksten er: " +tekst1.getTekst());
        System.out.println("Teksten med bare store bokstaver er: " +tekst1.storeBokstaver());
    }
}














