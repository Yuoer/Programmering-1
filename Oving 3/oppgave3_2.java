import static javax.swing.JOptionPane.showInputDialog;

public class oppgave3_2 {
    public static void main(String[] args){

        int tall = 1;

        while(tall != 0){
            String tallLest = showInputDialog("Sjekk for primtall, skriv ´0` for å stoppe");

            if("avslutt" == tallLest){
                break;
            }

            tall = Integer.parseInt(tallLest);
            int primtall = 0;

            for(int i = 2; i < tall; i++){
                if(tall % i == 0){
                    primtall++;
                }
            }
            if(tall == 0){

            } else if(primtall != 0 || tall == 1){
                System.out.println(tall+ " er ikke et primtall");
            } else{
                System.out.println(tall+ " er et primtall");
            }


        }


    }
}
