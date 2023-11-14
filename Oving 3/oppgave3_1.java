import static javax.swing.JOptionPane.*;
class oppgave3_1 {
    public static void main(String[] args){

        int tall1;
        int tall2;
        do{
            String tall1Lest = showInputDialog("Tall 1:");
            tall1 = Integer.parseInt(tall1Lest);
        } while(tall1 <= 0);

        do{
            String tall2Lest = showInputDialog("Tall 2:");
            tall2 = Integer.parseInt(tall2Lest);
        }while(tall2 < tall1);



            for(int i = tall1; i <= tall2; i++){
            System.out.println(i+ "-gangen");
                for(int x = 1; x <= 10; x++) {
                    int y = i * x;
                    System.out.println(i + (" x ") + x + (" = ") + y);
                }
        }
    }
}