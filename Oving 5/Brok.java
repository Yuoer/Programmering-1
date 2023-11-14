public class Brok {

    private double teller;
    private double nevner;
    private static double svar;

    public Brok(double _teller, double _nevner){
        if(_nevner == 0){
            throw new IllegalArgumentException("Nevneren kan ikke være 0");
        }
        else{
            teller = _teller;
            nevner = _nevner;
        }
    }
    public Brok(double _teller){
        teller = _teller;
        nevner = 1;
    }

    public static void summer(Brok a, Brok b){
        svar = ((a.teller/a.nevner)+(b.teller/b.nevner));
    }
    public static void substraher(Brok a, Brok b){
        svar = ((a.teller/a.nevner)-(b.teller/b.nevner));
    }
    public static void multipliser(Brok a, Brok b){
        svar = ((a.teller/a.nevner)*(b.teller/b.nevner));
    }
    public static void divider(Brok a, Brok b){
        svar = ((a.teller/a.nevner)/(b.teller/b.nevner));
    }

    public static double get_svar(){
        return svar;
    }

}
