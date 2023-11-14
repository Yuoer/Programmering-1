public class oppgave8_1 {
  public static void main(String[] args) {
    ArbTaker.testKlasse();
    Person person2 = new Person("Scott", "Robinson", 2002);
    ArbTaker arbeidstaker2 = new ArbTaker(person2, 588, 2017, 200, 30);
    arbeidstaker2.visInfo();
    arbeidstaker2.meny();
  }

}
