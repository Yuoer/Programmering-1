import java.util.ArrayList;

public class Oppgave10_2 {
  public static void main(String[] args) {
    testKlasse();
  }

  public static void testKlasse() {
    MenyRegister menyRegister = new MenyRegister();
    menyRegister.nyRett("Pasta carbonara", "hovedrett", "Pasta...", 200);
    menyRegister.nyRett("Pizza", "hovedrett", "Pepperoni...", 150);
    menyRegister.nyRett("Kjøttboller", "hovedrett", "Kjøtt...", 100);
    menyRegister.nyRett("Iskrem", "dessert", "Melk....", 100);
    menyRegister.nyRett("Ost og kjeks", "forrett", "Ost, kjeks..", 120);
    menyRegister.nyRett("Kveite", "hovedrett", "Kveite,..", 300);
    menyRegister.nyRett("Tiramisu", "dessert", "...", 100);


    System.out.println("Skriver ut pasta carbonara:");
    System.out.println(menyRegister.finnRettNavn("Pasta carbonara"));
    System.out.println("Skriver ut alle hovedrettene:");
    System.out.println(menyRegister.finnRettType("hovedrett"));



    ArrayList<Rett> menyRetter0 = new ArrayList<>();
    menyRetter0.add(menyRegister.getRetter().get(0));
    menyRetter0.add(menyRegister.getRetter().get(1));
    menyRetter0.add(menyRegister.getRetter().get(2));
    menyRegister.nyMeny(menyRetter0);
    System.out.println("Skriver ut alle rettene i meny 0:");
    System.out.println(menyRegister.getMenyer().get(0).toString());

    menyRetter0.add(menyRegister.getRetter().get(5));
    System.out.println("Skriver ut alle rettene i meny 0:");
    System.out.println(menyRegister.getMenyer().get(0).toString());

    ArrayList<Rett> menyRetter1 = new ArrayList<>();
    menyRetter1.add(menyRegister.getRetter().get(2));
    menyRetter1.add(menyRegister.getRetter().get(4));
    menyRetter1.add(menyRegister.getRetter().get(5));
    menyRetter1.add(menyRegister.getRetter().get(6));
    menyRegister.nyMeny(menyRetter1);
    System.out.println("Skriver ut alle rettene i meny 1:");
    System.out.println(menyRegister.getMenyer().get(1).toString());

    System.out.println(menyRegister.getMenyTotalprisInnenfor(500, 700));
  }
}
