public class NyString {
    private final String tekst;
    public NyString(String _tekst){
        tekst = _tekst;
    }
    public String getTekst(){
        return tekst;
    }
    public String forbokstaver(){
        String[] ord = getTekst().split(" ");
        String bokstaver = "";

        for (int i = 0; i < ord.length; i++) {
            String a = ord[i];
            bokstaver += a.charAt(0);
        }
        return bokstaver;
    }
    public String fjernBokstav(String bokstav){
        String[] utenBokstav = getTekst().split(bokstav);
        String setningUten = "";
        for (int i = 0; i < utenBokstav.length; i++) {
            setningUten += utenBokstav[i];
        }
        return setningUten;
    }


}
