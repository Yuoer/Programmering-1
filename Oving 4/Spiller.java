import java.util.Random;

public class Spiller {
    private int sumPoeng;
    private Random terning;

    public Spiller() {
        sumPoeng = 0;
        terning = new Random();
    }

    public int getSumPoeng() {
        return sumPoeng;
    }

    public void kastTerningen(String spiller) {
        int terningkast = terning.nextInt(6) + 1; //Simulerer et terningkast
        System.out.println(spiller+ " kaster en " + terningkast); //Skriver ut hva spilleren kastet

        if (terningkast == 1) {
            sumPoeng = 0;
            System.out.println("Mister tur og poengene blir nullstilt."); //Nullstiller poengene om det ble kastet 1
        } else {
            sumPoeng += terningkast; //Ellers legges kastet til i poengsummen
        }
    }

    public boolean erFerdig() {
        return sumPoeng >= 100;
    }
}

