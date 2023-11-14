import java.util.*;

class oppgave6_2{

    public static void main(String[] args){
        while(true){
            start();
        }

    }
    public static void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Tast inn teksten som skal analyseres:");
        String input = in.nextLine();
        AntallTegn tekstanalyse = new AntallTegn(input);
        analyser(tekstanalyse);
    }

    public static void analyser(AntallTegn tekstanalyse) {
        System.out.println("Antall forskjellige bokstaver: " + tekstanalyse.getAntallForskjellige());
        System.out.println("Antall bokstaver: " + tekstanalyse.getAntallBokstaver());
        System.out.println("Prosentandel som ikke er bokstaver: " + tekstanalyse.getProsentIkkeBokstaver() + "%");
        System.out.println(tekstanalyse.getFlestForekomster());
    }




}
