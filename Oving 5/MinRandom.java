 import java.util.Random;
public class MinRandom{
    private static Random random = new Random();
    public MinRandom(){
    }
    public static int nesteHeltall(int nedre, int ovre){
        int intervall = ovre - nedre;
        int tilfTall = random.nextInt(intervall);
        return tilfTall + nedre;
    }
    public static double nesteDesimaltall(double nedre, double ovre){
        double intervall = ovre - nedre;
        double tilfTall = random.nextDouble();
        return nedre + (intervall * tilfTall);
        
    }
}

