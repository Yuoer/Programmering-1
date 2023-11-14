public class oppgave9_1 {
  public static void main(String[] args) {
    Oppgaveoversikt oversikt = new Oppgaveoversikt();

    oversikt.registrerNyStudent("August", 3);
    oversikt.registrerNyStudent("Linnea", 1);
    while (true) {
      oversikt.visMeny();
    }
    //Student.testKlasse();

    }
}
