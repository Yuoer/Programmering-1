public class Tekstbehandling {
    private final String tekst;
    String alfabet = "abcdefghijklmnopqrstuvwxyzæøå";
    String perioder = ".!:?";
    public Tekstbehandling(String tekst){
        this.tekst = tekst;
    }
    public String getTekst(){
        return tekst;
    }
    public int antallOrd(){
        String[] antall = getTekst().split(" ");
        return antall.length;
    }
    public float gjennomsnittligOrdlengde(){
        int antallBokstaver = 0;
        String tekstSma = getTekst().toLowerCase();
        for(int i = 0; i < tekstSma.length(); i++){
            for(int j = 0; j < alfabet.length(); j++){
                if(tekstSma.charAt(i) == alfabet.charAt(j)){
                    antallBokstaver++;
                }
            }
        }
        return (float) antallBokstaver / antallOrd();
    }
    public float antallOrdPP(){
        int antallPerioder = 0;
        for(int i = 0; i < getTekst().length(); i++){
            for(int j = 0; j < perioder.length(); j++){
                if(getTekst().charAt(i) == perioder.charAt(j)){
                    antallPerioder++;
                }
            }
        }
        return (float) antallOrd() / antallPerioder;

    }
    public String bytteUtOrd(String originalOrd, String nyttOrd){
        String[] utenOrd = getTekst().split(originalOrd);
        String nySetning = "";
        for(int i = 0; i < utenOrd.length - 1; i++){
            nySetning += utenOrd[i] + nyttOrd;
        }
        nySetning += utenOrd[utenOrd.length - 1];
        return nySetning;
    }
    public String storeBokstaver(){
        return getTekst().toUpperCase();
    }
}
