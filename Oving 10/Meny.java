import java.util.ArrayList;

public class Meny {
  private ArrayList<Rett> meny;

  public Meny(ArrayList<Rett> meny) {
    this.meny = meny;
  }
  public ArrayList<Rett> getMeny() {
    return meny;
  }
  public double getTotalpris() {
    double pris = 0;
    for (int i = 0; i < getMeny().size(); i++) {
      pris += getMeny().get(i).getPris();
    }
    return pris;
  }
  public String toString() {
    String tekst = "";
    for (int i = 0; i < getMeny().size(); i++) {
      tekst += meny.get(i).toString();
    }
    return tekst;
  }
}
