public class Property {
  private final int lotNumber;
  private final int sectionNumber;
  private String name;
  private final double area;
  private String nameOfOwner;
  private final int municipalityNumber;
  private final String municipalityName;

  public Property(String municipalityName, int municipalityNumber, int lotNumber, int sectionNumber, String name, double area, String nameOfOwner) {
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = name;
    this.area = area;
    this.nameOfOwner = nameOfOwner;
    this.municipalityName = municipalityName;
    this.municipalityNumber = municipalityNumber;
  }
  public int getMunicipalityNumber() {
    return municipalityNumber;
  }

  public String getMunicipalityName() {
    return municipalityName;
  }
  public int getLotNumber() {
    return lotNumber;
  }

  public int getSectionNumber() {
    return sectionNumber;
  }

  public String getName() {
    return name;
  }

  public double getArea() {
    return area;
  }

  public String getNameOfOwner() {
    return nameOfOwner;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNameOfOwner(String nameOfOwner) {
    this.nameOfOwner = nameOfOwner;
  }

  public String getPropertyID() {
    return (String) "" + getMunicipalityNumber() + "-" + getLotNumber() + "/" + getSectionNumber();
  }

  @Override
  public String toString() {
    return "Property{" + "municipalityName=" + getMunicipalityName() + ", " + getMunicipalityNumber() + "-" + getLotNumber() + "/" + getSectionNumber() + ", name='" + getName() + '\'' + ", area=" + getArea() + ", nameOfOwner='" + getNameOfOwner() + '\'' + '}';
  }
}
