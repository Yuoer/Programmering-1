import java.util.Random;

public class oppgave4_2 {
    public static void main(String[] args){
        Spiller spillerA = new Spiller();
        Spiller spillerB = new Spiller(); //Oppretter to spillere
        int rundeNummer = 1; //Setter rundenummeret til 1

        while (true) { //Lager en løkke som kjører helt til break lengre nede i koden

            String a = "Spiller A";
            String b = "Spiller B";
            System.out.println("Runde " + rundeNummer + ":");

            spillerA.kastTerningen(a); //Kjører kast terning for begge spillere
            spillerB.kastTerningen(b);

            System.out.println("Spiller A - Poeng: " + spillerA.getSumPoeng()); //Skriver ut poengsum
            System.out.println("Spiller B - Poeng: " + spillerB.getSumPoeng());

            if (spillerA.erFerdig() || spillerB.erFerdig()) { //Sjekker om poengsummen er over eller lik 100
                System.out.println("Spillet er ferdig!"); //Er den det avsluttes spillet
                if (spillerA.erFerdig() && spillerB.erFerdig()) {
                    System.out.println("Det er uavgjort!"); //Sjekker så om det ble uavgjort
                } else if (spillerA.erFerdig()) {
                    System.out.println("Spiller A har vunnet!"); //Seier til A
                } else {
                    System.out.println("Spiller B har vunnet!"); //Eller seier til B
                }
                break;
            }

            rundeNummer++;
        }

    }


}