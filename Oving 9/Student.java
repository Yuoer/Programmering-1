public class Student {
  private final String navn;
  private int antOppg;

  public Student(String navn, int antOppg) {
    this.navn = navn;
    this.antOppg = antOppg;
  }

  public String getNavn() {
    return navn;
  }

  public int getAntOppg() {
    return antOppg;
  }

  public void okAntOppg(int okning) {
    antOppg += okning;
  }

  public String toString() {
    return (String) "Student{navn='" + getNavn() + "', antall oppgaver='" + getAntOppg() + "'}";
  }

  public static void testKlasse() {
    Student student1 = new Student("August", 0);
    System.out.println(student1);
    System.out.println("Øker antall oppgaver med 3");
    student1.okAntOppg(3);
    System.out.println(student1);
    System.out.println("Øker antall oppgaver med 2");
    student1.okAntOppg(2);
    System.out.println(student1);
  }
}
