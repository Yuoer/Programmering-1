public class Rett {
  private final String navn;
  private final String type;
  private final String oppskrift;
  private final double pris;

  public Rett(String navn, String type, String oppskrift, double pris) {
    this.navn = navn;
    this.type = type;
    this.oppskrift = oppskrift;
    this.pris = pris;
  }
  public String getNavn() {
    return navn;
  }
  public String getType() {
    return type;
  }
  public String getOppskrift() {
    return oppskrift;
  }
  public double getPris() {
    return pris;
  }
  public String toString() {
    return "Navn: " + this.getNavn() + ", type: " + this.getType() + ", pris: " + this.getPris() + ", oppskrift: " + this.getOppskrift() + "\n";
  }
}
