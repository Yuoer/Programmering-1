import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class ArrangementRegister {
  ArrayList<Arrangement> arrangementer;

  public ArrangementRegister() {
    arrangementer = new ArrayList<>();
  }

  public void nyttArrangement(int nummer, String navn, String sted, String arrangor, String type, long tidspunkt) {
    Arrangement arrangement = new Arrangement(nummer, navn, sted, arrangor, type, tidspunkt);
    arrangementer.add(arrangement);
  }

  public int getAntallArrangement() {
    return arrangementer.size();
  }

  public String finnArrangementerSted(String sted) {
    String navn = "Navnet på arrangementene i " + sted + ": \n";
    for (int i = 0; i < getAntallArrangement(); i++) {
      if (arrangementer.get(i).getSted().equals(sted)) {
        navn += arrangementer.get(i).toString();
      }
    }
    return navn;
  }

  public String finnArrangementerDato(long dato) {
    String navn = "Navnet på arrangementene er: \n";
    for (int i = 0; i < getAntallArrangement(); i++) {
      long heltall = arrangementer.get(i).getTidspunkt() / 10000;
      if (heltall == dato) {
        navn += arrangementer.get(i).toString();
      }
    }
    return navn;
  }

  public String toString() {
    String arrangementerTekst = "";
    for (Arrangement arrangement : arrangementer) {
      arrangementerTekst += arrangement.toString();
    }
    return arrangementerTekst;
  }

  public ArrayList<Arrangement> arrangementMellom(long startdato, long sluttdato) {
    sorterTid();
    ArrayList<Arrangement> arrangement = new ArrayList<>();
    for (int i = 0; i < arrangementer.size(); i++) {
      long heltall = arrangementer.get(i).getTidspunkt() / 10000;
      if (heltall >= startdato && heltall <= sluttdato) {
        arrangement.add(arrangementer.get(i));
      }
    }

    return arrangement;
  }
  public String sorterSted() {
    Comparator<Arrangement> sorterEtterSted = Comparator.comparing(Arrangement::getSted);
    ArrayList<Arrangement> ar1 = arrangementer;
    Collections.sort(ar1, sorterEtterSted);
    return ar1.toString();
  }
  public String sorterType() {
    Comparator<Arrangement> sorterEtterType = Comparator.comparing(Arrangement::getType);
    ArrayList<Arrangement> ar2 = arrangementer;
    Collections.sort(ar2, sorterEtterType);
    return ar2.toString();
  }

  public String sorterTid() {
    Comparator<Arrangement> sorterEtterTid = Comparator.comparingInt((Arrangement a) -> (int) a.getTidspunkt());
    ArrayList<Arrangement> ar3 = arrangementer;
    Collections.sort(ar3, sorterEtterTid);
    return ar3.toString();
  }


  public void visMeny() {
    Scanner in = new Scanner(System.in);

    System.out.println("Tast 1 for å registrere et nytt arrangement");
    System.out.println("Tast 2 for å finne arrangementer på et visst sted");
    System.out.println("Tast 3 for å finne arrangementer på en viss dato");
    System.out.println("Tast 4 for å finne arrangementer innenfor et tidsintervall");
    System.out.println("Tast 5 for å lage lister over alle arrangementer, sortert etter henholdsvis sted, type og tidspunkt.");

    int input = in.nextInt();
    switch (input) {
      case 1:
        Scanner in1 = new Scanner(System.in);
        System.out.println("Skriv inn nummer for arrangementet: ");
        int nummer = in1.nextInt();
        in1.nextLine();
        System.out.println("Skriv inn navnet på arrangementet: ");
        String navn = in1.nextLine();
        System.out.println("Skriv inn et sted for arrangementet: ");
        String sted = in1.nextLine();
        System.out.println("Skriv inn navnet på arrangøren: ");
        String arrangor = in1.nextLine();
        System.out.println("Skriv inn type arrangement: ");
        String type = in1.nextLine();
        System.out.println("Skriv inn tidspunktet for arrangementet (YYYYMMDDHHMM): ");
        long tidspunkt = in1.nextLong();
        nyttArrangement(nummer, navn, sted, arrangor, type, tidspunkt);
        System.out.println(arrangementer);
        break;
      case 2:
        Scanner in2 = new Scanner(System.in);
        System.out.println("Hvilket sted vil du finne arrangementer på? ");
        String sted1 = in2.nextLine();
        System.out.println(finnArrangementerSted(sted1));
        break;
      case 3:
        Scanner in3 = new Scanner(System.in);
        System.out.println("Hvilken dato vil du finne arrangementer på? ");
        long dato = in3.nextLong();
        System.out.println(finnArrangementerDato(dato));
        break;
      case 4:
        Scanner in4 = new Scanner(System.in);
        System.out.println("Hvilken dato vil du finne arrangementer fra? ");
        long datoFra = in4.nextLong();
        System.out.println("Hvilken dato vil du finne arrangementer til? ");
        long datoTil = in4.nextLong();
        System.out.println(arrangementMellom(datoFra, datoTil));
        break;
      case 5:
        Scanner in5 = new Scanner(System.in);
        System.out.println("Vil du sortere basert på sted (1), type (2) eller tidspunkt (3):");
        int valg = in5.nextInt();
        if (valg == 1) {
          System.out.println(sorterSted());
        } else if (valg == 2) {
          System.out.println(sorterType());
        } else if (valg == 3) {
          System.out.println(sorterTid());

        } else {
          System.out.println("Du må skrive et tall mellom 1 og 3");
        }
        break;
      default:
        System.out.println("Du må skrive inn et tall mellom 1 og 5");
    }
  }
}
