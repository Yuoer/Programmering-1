import java.util.ArrayList;

public class PropertyRegister {

  private ArrayList<Property> properties;

  public PropertyRegister() {
    this.properties = new ArrayList<>();
  }

  public ArrayList<Property> getProperties() {
    return properties;
  }


  public void newProperty(String municipalityName, int municipalityNumber, int lotNumber, int sectionNumber, String name, double area, String nameOfOwner) {
    Property property = new Property(municipalityName, municipalityNumber, lotNumber, sectionNumber, name, area, nameOfOwner);
    properties.add(property);
  }

  public void deleteProperty(Property delProperty) {
    properties.remove(delProperty);
  }

  public int amountOfProperties() {
    return properties.size();
  }

  public String printProperties() {
    String tekst = "";
    for (int i = 0; i < getProperties().size(); i++) {
      tekst += getProperties().get(i).toString() + "\n";
    }
    return tekst;
  }

  public String findProperty(int municipalityNumber, int lotNumber, int sectionNumber) {
    for (int i = 0; i < getProperties().size(); i++) {
      if (getProperties().get(i).getMunicipalityNumber() == municipalityNumber && getProperties().get(i).getLotNumber() == lotNumber && getProperties().get(i).getSectionNumber() == sectionNumber) {
        return getProperties().get(i).toString();
      }
    }
    return (String) "Could not find the property";
  }
  
  public double averageArea() {
    double totalArea = 0;
    for (int i = 0; i < getProperties().size(); i++) {
      totalArea += getProperties().get(i).getArea();
    }
    return totalArea / getProperties().size();
  }

  public String findPropertiesLotNumber(int lotNumber) {
    String tekst = "";
    for (int i = 0; i < getProperties().size(); i++) {
      if (getProperties().get(i).getLotNumber() == lotNumber) {
        tekst += getProperties().get(i).toString() + "\n";
      }
    }
    return tekst;
  }

}
