import java.util.ArrayList;
import java.util.Objects;

public class MenyRegister {
  private ArrayList<Meny> menyer;
  private ArrayList<Rett> retter;


  public MenyRegister() {
    menyer = new ArrayList<Meny>();
    retter = new ArrayList<Rett>();
  }
  public ArrayList<Meny> getMenyer() {
    return menyer;
  }
  public ArrayList<Rett> getRetter() {
    return retter;
  }


  public Rett nyRett(String navn, String type, String oppskrift, double pris) {
    Rett rett = new Rett(navn, type, oppskrift, pris);
    retter.add(rett);
    return rett;
  }
  public String finnRettNavn(String navn) {
    String rett = "";
    for (int i = 0; i < getRetter().size(); i++) {
      if (Objects.equals(retter.get(i).getNavn(), navn)) {
        rett = retter.get(i).toString();
      }
    }
    return rett;
  }
  public String finnRettType(String type) {
    String rett = "";
    for (int i = 0; i < getRetter().size(); i++) {
      if (Objects.equals(retter.get(i).getType(), type)) {
        rett += retter.get(i).toString();
      }
    }
    return rett;
  }
  public Meny nyMeny(ArrayList<Rett> retter) {
    Meny meny = new Meny(retter);
    menyer.add(meny);
    return meny;
  }

  public String getMenyTotalprisInnenfor(double nedre, double ovre) {
    String menyerInnenfor = "Menyene som har totalpris mellom " + nedre + " og " + ovre + " er: \n";
    for (int i = 0; i < getMenyer().size(); i++) {
      if (getMenyer().get(i).getTotalpris() > nedre && getMenyer().get(i).getTotalpris() < ovre) {
        menyerInnenfor += "Meny " + i + " som har rettene: \n" + getMenyer().get(i).toString();
      }
    }
    return menyerInnenfor;
  }
}
