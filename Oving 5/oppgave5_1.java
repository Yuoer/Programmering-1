public class oppgave5_1 {
    public static void main(String args[]){
        Brok a;
        Brok b;

        a = new Brok(10, 3);
        b = new Brok(10);
        Brok.summer(a, b);
        System.out.println(Brok.get_svar());

        a = new Brok(10, 1);
        b = new Brok(10);
        Brok.substraher(a, b);
        System.out.println(Brok.get_svar());

        a = new Brok(10, 1);
        b = new Brok(10);
        Brok.multipliser(a, b);
        System.out.println(Brok.get_svar());

        a = new Brok(10, 1);
        b = new Brok(10);
        Brok.divider(a, b);
        System.out.println(Brok.get_svar());


    }

}
