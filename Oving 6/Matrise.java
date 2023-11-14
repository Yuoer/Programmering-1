public class Matrise {
    private final double[][] matrise;

    private Matrise(double[][] _matrise){
        matrise = _matrise;
    }
    public static Matrise fyllMatrise(double[][] _matrise) {
        return new Matrise(_matrise);
    }
    public double[][] getMatrise() {
        return matrise;
    }
    public int getRader(){
        int rader = matrise.length;
        return rader;
    }
    public int getKolonner(){
        int kolonner = matrise[0].length;
        return kolonner;
    }

    public static Matrise addereMatrise(Matrise matrise1, Matrise matrise2){
        int rader = matrise1.getRader();
        int kolonner = matrise1.getKolonner();
        double[][] matrise = new double[rader][kolonner];
        for(int i = 0; i < rader; i++){
            for(int j = 0; j < kolonner; j++){
                matrise[i][j] = matrise1.matrise[i][j] + matrise2.matrise[i][j];
            }
        }
        return new Matrise(matrise);
    }
    public static Matrise multiplisereMatrise(Matrise a, Matrise b) {
        int aRader = a.getMatrise().length;
        int aKolonner = a.getMatrise()[0].length;
        int bRader = b.getMatrise().length;
        int bKolonner = b.getMatrise()[0].length;
        if (aKolonner == bRader) {
            double[][] n = new double[aRader][bKolonner];
            for (int i = 0; i < bKolonner; i++) {
                for (int j = 0; j < aRader; j++) {
                    for (int k = 0; k < aKolonner; k++) {
                        n[j][i] = n[j][i] + a.getMatrise()[j][k] * b.getMatrise()[k][i];
                    }
                }
            }
            return new Matrise(n);
        } else {
            return null;
        }
    }
    public static Matrise transponereMatrise(Matrise m){
        int rader = m.getKolonner();
        int kolonner = m.getRader();
        double[][] n = new double[rader][kolonner];
        for(int i = 0; i < rader; i++){
            for(int j = 0; j < kolonner; j++){
                n[i][j] = m.matrise[j][i];
            }
        }
        return new Matrise(n);
    }


}
