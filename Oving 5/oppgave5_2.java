import java.util.Scanner;

public class oppgave5_2 {
    public static void main(String[] args){
        test();
        visMeny();
    }
    public static void visMeny(){
        int helDes = 0;
        do {
            Scanner in1 = new Scanner(System.in);
            System.out.println("Velg  mellom et tilfeldig: \n 1: Heltall \n 2: Desimaltall \n 3: Avslutt");
            helDes = in1.nextInt();
        } while (helDes != 1 && helDes != 2 && helDes != 3);

        if (helDes == 3) {
            return;
        }

        double tall = 0;

        Scanner in2 = new Scanner(System.in);
        System.out.println("Tast inn nedre grense i intervallet:");
        int nedreInp = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        System.out.println("Tast inn øvre grense i intervallet:");
        int ovreInp = in3.nextInt();

        if (helDes == 1) {
            tall = MinRandom.nesteHeltall(nedreInp, ovreInp);
        } else {
            tall = MinRandom.nesteDesimaltall(nedreInp, ovreInp);
        }

        System.out.println("Det tilfeldige tallet ble " + tall);

        System.out.println("");
        visMeny();
    }
    public static void test(){ /*For å teste ut programmet*/
        System.out.println("Tilfeldige heltall mellom 5 og 15:"); /*Tester heltall*/
        for(int i = 0; i < 15; i++){
            System.out.println(MinRandom.nesteHeltall(5, 15));
        }
        System.out.println("Tilfeldige desimaltall mellom 5 og 15:"); /*Tester desimaltall*/
        for(int i = 0; i < 15; i++){
            System.out.println(MinRandom.nesteDesimaltall(5, 15));
        }

    }

}
