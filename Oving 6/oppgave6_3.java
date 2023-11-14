import java.util.*;
public class oppgave6_3 {
    public static Matrise[] matrise = new Matrise[2];

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Lag matrise nr. 1:");
        matrise[0] = Matrise.fyllMatrise(lagMatrise());
        System.out.println("Matrise nr. 1:");
        skrivUtMatrise(matrise[0]);

        System.out.println("Tast: \n 1: for å addere denne matrisen med en annen matrise \n 2: for å multiplisere denne matrisen med en annen \n 3: for å transportere denne matrisen");

        int valg = in.nextInt();
        switch (valg){
            case 1:
                matrise[1] = Matrise.fyllMatrise(lagBestemtMatrise(matrise[0].getRader(), matrise[0].getKolonner()));
                System.out.println("Matrise nr. 2:");
                skrivUtMatrise(matrise[1]);
                Matrise a = Matrise.addereMatrise(matrise[0], matrise[1]);
                System.out.println("Matrisene addert blir:");
                skrivUtMatrise(a);
                break;
            case 2:
                System.out.println("Lag matrise nr. 2 (antall rader må være lik " + matrise[0].getKolonner() + "):");
                matrise[1] = Matrise.fyllMatrise(lagMatrise());
                System.out.println("Matrise nr. 2:");
                skrivUtMatrise(matrise[1]);
                Matrise b = Matrise.multiplisereMatrise(matrise[0], matrise[1]);
                if (b != null) {
                    System.out.println("Resultat:");
                    skrivUtMatrise(b);
                } else {
                    System.out.println("Noe gikk galt, antall kolonner i matrise 1 må være lik antall rader i matrise 2");
                }
                break;
            case 3:
                Matrise c = Matrise.transponereMatrise(matrise[0]);
                System.out.println("Resultat:");
                skrivUtMatrise(c);
                break;
            default:
                System.out.println("Du må skrive inn 1, 2 eller 3");
                break;
        }

    }

    public static double[][] lagMatrise(){
        System.out.println("Hvor mange rader skal matrisen ha: ");
        int rader = in.nextInt();
        System.out.println("Hvor mange kolonner skal matrisen ha: ");
        int kolonner = in.nextInt();
        double[][] matrise = new double[rader][kolonner];

        for(int i = 0; i < rader; i++){
            for(int j = 0; j < kolonner; j++){
                System.out.print("[" +i+ "][" +j+ "]: ");
                matrise[i][j] = in.nextDouble();
            }
        }

        return matrise;
    }
    public static double[][] lagBestemtMatrise(int rader, int kolonner){
        double[][] matrise = new double[rader][kolonner];
        for(int i = 0; i < rader; i++){
            for(int j = 0; j < kolonner; j++){
                System.out.print("[" +i+ "][" +j+ "]: ");
                matrise[i][j] = in.nextDouble();
            }
        }
        return matrise;
    }
    public static void skrivUtMatrise(Matrise matrise){
        int rader = matrise.getRader();
        int kolonner = matrise.getKolonner();
        double[][] m = matrise.getMatrise();
        for(int i = 0; i < rader; i++){
            for(int j = 0; j < kolonner; j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
