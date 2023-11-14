import java.util.Random;
public class oppgave6_1 {
    public static Random random = new Random();

    public static void main(String[] args){
        tilfeldigTall(10000);
    }
    public static void tilfeldigTall(int antallGanger){
        int[] liste = new int[10];
        for(int i = 0; i < antallGanger; i++) {
            int tall = random.nextInt(10);
            liste[tall] += 1;
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Antall " +i+ "ere: " +liste[i]);
        }
    }
}
