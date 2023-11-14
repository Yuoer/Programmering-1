import java.util.*;

class AntallTegn {
    private static int[] antallTegn;
    private static String[] bokstaver = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","æ","ø","å"};

    public AntallTegn(String input) {
        antallTegn = new int[30]; /*Lager en liste for hvor mange forekomster av hver bokstav*/
        for (int a = 0; a < 30; a++) {
            antallTegn[a] = 0; /*Setter alle verdiene i lista til 0*/
        }
        input = input.toLowerCase(); /*Gjør alle bokstavene til små bokstaver*/
        int lengde = input.length(); /*Finner lengden på strengen som skal analyseres og kjører gjennom alle tegnene med for-løkke*/
        for (int i = 0; i < lengde; i++) {
            char indexChar = input.charAt(i); /*Setter index-verdien til tegnet på i-plass som indexChar*/
            String bokstav = Character.toString((char)indexChar); /*Tar indekstall, konverterer det til et tegn og deretter konverterer tegnet til en streng*/
            int index = Arrays.asList(bokstaver).indexOf(bokstav); /*Gjør array bokstaver til en arraylist, og gir indeksen til bokstavens plassering i lista*/
            if (index == -1) { /*Finnes ikke tegnet i lista med bokstaver settes indeksen til -1*/
                index = 29;
            }
            antallTegn[index] += 1;
        }
    }
    public static int getAntallForskjellige() {
        int sum = 0;
        for (int i = 0; i < 29; i++) { /*Går gjennnom hele lista og legger til 1 i sum om en bokstav har blitt registrert*/
            if (antallTegn[i] > 0) {
                sum++;
            }
        }
        return sum;
    }
    public static int getAntallBokstaver() {
        int sum = 0;
        for (int i = 0; i < 29; i++) { /*Går gjennom hele lista og legger sammen alle bokstavene som er registrert*/
            sum = antallTegn[i] + sum;
        }
        return sum;
    }
    public static double getProsentIkkeBokstaver() {
        int antallBokstaver = getAntallBokstaver(); /*Kaller på getAntallBokstaver for å få antall bokstaver*/
        int antallAndre = antallTegn[29]; /*Bruker antall tegn som ikke er bokstaver fra antallTegn*/
        double totalt = antallBokstaver + antallAndre; /*Finner totalt antall tegn*/
        double prosent = (antallAndre / totalt) * 100; /*Deler antall tegn på det totale og ganger med 100 for å få prosent*/
        prosent = Math.round(prosent * 100.0) / 100.0;
        return prosent;
    }
    public static String getFlestForekomster() {
        int hoyest = -1;
        String hoyestBokstav = "";
        for ( int i = 0; i < 29; i++ ) { /*Går gjennom lista med antall forekomster av hver bokstav*/
            if (antallTegn[i] > hoyest) { /*Om tallet i lista er høyere enn noen tidligere settes den som verdi høyest og bokstaven settes som den høyeste bokstaven*/
                hoyest = antallTegn[i];
                hoyestBokstav = bokstaver[i];
            } else if (antallTegn[i] == hoyest) { /*Om tallet er like stort legges bokstaven det hører til i lista sammen med det andre i høyestBokstav*/
                hoyestBokstav = hoyestBokstav + ", " + bokstaver[i];
            }
        }
        return "Bokstaven som forekommer oftest er \"" + hoyestBokstav + "\" (" + hoyest + " ganger)";
    }
}
