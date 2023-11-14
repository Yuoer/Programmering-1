import java.util.Scanner;

public class ArbTaker {
  private final Person personalia;
  private final int arbtakernr;
  private final int ansettelsesar;
  private double manedslonn;
  private double skatteprosent;

  java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();

  int ar = kalender.get(java.util.Calendar.YEAR);

  public ArbTaker(Person personalia, int arbtakernr, int ansettelsesar, double manedslonn, double skatteprosent) {
    this.personalia = personalia;
    this.arbtakernr = arbtakernr;
    this.ansettelsesar = ansettelsesar;
    this.manedslonn = manedslonn;
    this.skatteprosent = skatteprosent;
  }
  public Person getPersonalia() {
    return personalia;
    }

  public int getArbtakernr() {
    return arbtakernr;
  }
  public int getAnsettelsesar(){
      return ansettelsesar;
    }
  public double getManedslonn(){

      return manedslonn;
    }
  public double getSkatteprosent() {

      return skatteprosent;
    }
  public void setManedslonn(int manedslonn){

      this.manedslonn = manedslonn;
    }
  public void setSkatteprosent(double skatteprosent){

      this.skatteprosent = skatteprosent;
    }
  public double getSkattetrekk(){

      return getManedslonn()*(getSkatteprosent()/100);
    }
  public double getBruttoLonnPerAr(){

      return getManedslonn()*12;
    }
  public double getSkattetrekkPerAr(){

      return getSkattetrekk()*10.5;
    }
  public int getAlder(){

      return ar - getPersonalia().getFodselsar();
    }
  public String getNavn(){
      return getPersonalia().getEtternavn()+ ", " +getPersonalia().getFornavn();
    }
    public int getArIBedrift(){

      return ar - getAnsettelsesar();
    }
    public boolean ansattLengreEnn(int ar){
        return ar < getArIBedrift();
    }
    public static void testKlasse(){
        Person person1 = new Person("August", "Bøgseth", 2002);
        ArbTaker arbeidstaker1 = new ArbTaker(person1, 500, 2019, 100, 25);

        System.out.println("Fullt navn: " +arbeidstaker1.getNavn());
        System.out.println("Månedslønn: " +arbeidstaker1.getManedslonn());
        System.out.println("Skatteprosent: " +arbeidstaker1.getSkatteprosent());
        System.out.println("Skattetrekk: " +arbeidstaker1.getSkattetrekk());
        System.out.println("Bruttolønn per år: " +arbeidstaker1.getBruttoLonnPerAr());
        System.out.println("Skattetrekk per år: " +arbeidstaker1.getSkattetrekkPerAr());
        System.out.println("Alder: " +arbeidstaker1.getAlder());
        System.out.println("Antall år i bedriften: " +arbeidstaker1.getArIBedrift());
        System.out.println("Ansatt lengre enn 4 år: " +arbeidstaker1.ansattLengreEnn(4));
        System.out.println("Arbtakernr: " +arbeidstaker1.getArbtakernr());
        System.out.println("_________________________________________");
    }
    public void visInfo(){
        System.out.println("Fullt navn: " +getNavn());
        System.out.println("Alder: " +getAlder());
        System.out.println("Arbtakernr: " +getArbtakernr());
        System.out.println("Månedslønn: " +getManedslonn());
        System.out.println("Skatteprosent: " +getSkatteprosent());
        System.out.println("Skattetrekk: " +getSkattetrekk());
        System.out.println("Bruttolønn per år: " +getBruttoLonnPerAr());
        System.out.println("Skattetrekk per år: " +getSkattetrekkPerAr());
        System.out.println("Antall år i bedriften: " +getArIBedrift());
        System.out.println("Ansatt lengre enn 4 år: " +ansattLengreEnn(4));
        System.out.println("_________________________________________");

    }
    public void meny(){
        boolean meny = true;
        while(meny){
            Scanner in1 = new Scanner(System.in);
            System.out.println("1: Endre månedslønn");
            System.out.println("2: Endre skatteprosent");
            System.out.println("3: Avslutt");
            int input1 = in1.nextInt();
            switch(input1) {
                case 1:
                    System.out.print("Ny månedslønn: ");
                    Scanner in2 = new Scanner(System.in);
                    int input2 = in2.nextInt();
                    setManedslonn(input2);
                    visInfo();
                    break;
                case 2:
                    System.out.print("Ny skatteprosent: ");
                    Scanner in3 = new Scanner(System.in);
                    double input3 = in3.nextDouble();
                    setSkatteprosent(input3);
                    visInfo();
                    break;
                case 3:
                    System.out.println("Avslutter...");
                    meny = false;
                    break;
                default:
                    System.out.println("Oppgi et gyldig nummer");
            }
        }
    }
}
