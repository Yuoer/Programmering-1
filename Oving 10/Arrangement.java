public class Arrangement {

  private final int nummer;
  private final String navn;
  private final String sted;
  private final String arrangor;
  private final String type;
  private final long tidspunkt;

  public Arrangement(int nummer, String navn, String sted, String arrangor, String type, long tidspunkt) {
    this.nummer = nummer;
    this.navn = navn;
    this.sted = sted;
    this.arrangor = arrangor;
    this.type = type;
    this.tidspunkt = tidspunkt;
  }

  public int getNummer() {
    return nummer;
  }

  public String getNavn() {
    return navn;
  }

  public String getSted() {
    return sted;
  }

  public String getArrangor() {
    return arrangor;
  }

  public String getType() {
    return type;
  }

  public long getTidspunkt() {
    return tidspunkt;
  }
  public String toString() {
    return (String) "Arrangementnummer: " + getNummer() + ", Navn: " + getNavn() + ", Sted: " + getSted() + ", Arrangør: " + getArrangor() + ", Type: " + getType() + ", Tidspunkt(YYYYMMDDHHMM): " + getTidspunkt() + "\n\r";
  }
}
