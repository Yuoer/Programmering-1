import java.util.ArrayList;
import java.util.Scanner;

public class Oppgaveoversikt {
  private final ArrayList<Student> studenter;

  public Oppgaveoversikt() {
    studenter = new ArrayList<>();
  }

  public int getAntStud() {
    return studenter.size();
  }

  public int getAntOppgaver(Student student) {
    return (int) student.getAntOppg();
  }

  public void registrerNyStudent(String navn, int antOppg) {
    Student student = new Student(navn, antOppg);
    studenter.add(student);
  }

  public void okAntOppgaver(Student student, int okning) {
    student.okAntOppg(okning);
  }

  public int finnIndexStudent(String navn) {
    int index = -1;
    for (int i = 0; i < getAntStud(); i++) {
      if (studenter.get(i).getNavn().equals(navn)) {
        index = i;
      }
    }
    return index;
  }

  public String toString() {
    String oversiktStudenter = "";

    for (int i = 0; i < getAntStud(); i++) {
      oversiktStudenter += "Student nr. " + i +  " Navn: " + studenter.get(i).getNavn() + "Antall oppgaver: " + studenter.get(i).getAntOppg() + "\n";
    }
    return oversiktStudenter;
  }

  public void visMeny() {
    Scanner in = new Scanner(System.in);

    System.out.println("Tast 1 for å vise alle studenter");
    System.out.println("Tast 2 for å finne antall studenter som er registrert");
    System.out.println("Tast 3 for å finne antall oppgaver en bestemt student har gjort");
    System.out.println("Tast 4 for å registrere en ny student");
    System.out.println("Tast 5 for å øke antall oppgaver gjort av en bestemt student");

    int input = in.nextInt();
    switch (input) {
      case 1:
        System.out.println(studenter);
        break;
      case 2:
        System.out.println("Antall studenter registrert er: " + getAntStud());
        break;
      case 4:
        Scanner in1 = new Scanner(System.in);
        System.out.println("Skriv inn navn på studenten: ");
        String navn1 = in1.nextLine();
        System.out.println("Skriv inn antall oppgaver studenten har gjort: ");
        int oppgaver = in1.nextInt();
        registrerNyStudent(navn1, oppgaver);
        break;
      case 5:
        Scanner in2 = new Scanner(System.in);
        System.out.println("Skriv inn navnet til studenten du skal øke antall oppgaver til: ");
        String navn2 = in2.nextLine();
        System.out.println("Antall oppgaver skal du legge til: ");
        int okning = in2.nextInt();
        okAntOppgaver(studenter.get(finnIndexStudent(navn2)), okning);
        break;
      default:
        throw new IllegalStateException("Skriv inn ett tall mellom 1-5. Du skrev: " + input);
    }
  }
}