import java.util.Scanner;

public class Oppgave11 {

  public PropertyRegister propertyRegister = new PropertyRegister();
  private final int ADD_PROPERTY = 1;
  private final int LIST_ALL_PROPERTIES = 2;
  private final int FIND_PROPERTY = 3;
  private final int CALCULATE_AVERAGE_AREA = 4;
  private final int FIND_PROPERTIES_LOT_NUMBER = 5;
  private final int EXIT = 6;

  public static void main(String[] args) {
    Oppgave11 oppgave11 = new Oppgave11();
    oppgave11.test();
    oppgave11.start();
  }
  private void test(){
    propertyRegister.newProperty("Gloppen", 1445, 77, 631, "",1017.6, "Jens Olsen");
    propertyRegister.newProperty("Gloppen", 1445, 77, 131, "Syningom",661.3, "Nicolay Madsen");
    propertyRegister.newProperty("Gloppen", 1445, 75, 19, "Fugletun",650.6, "Evilyn Jensen");
    propertyRegister.newProperty("Gloppen", 1445, 74, 188, "",1457.2, "Karl Ove Bråten");
    propertyRegister.newProperty("Gloppen", 1445, 69, 47, "Høiberg",1339.4, "Elsa Indregård");
  }

  private int showMenu() {
    int menuChoice = 0;
    System.out.println("***** Property Register Application *****");
    System.out.println("1. Add property");
    System.out.println("2. List all properties");
    System.out.println("3. Search property");
    System.out.println("4. Calculate average area");
    System.out.println("5. Search for properties with lot number");
    System.out.println("6. Quit");
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt()) {
      menuChoice = sc.nextInt();
    } else {
      System.out.println("You must enter a number, not text");
    }
    return menuChoice;
  }
  public void start() {
    boolean finished = false;
    while (!finished) {
      int menuChoice = this.showMenu();
      switch (menuChoice) {
        case ADD_PROPERTY:
          Scanner scanner1 = new Scanner(System.in);

          System.out.println("Enter the munucipality name:");
          String municipalityName = scanner1.nextLine();

          System.out.println("Enter the municipality number:");
          int municipalityNumber1 = scanner1.nextInt();

          System.out.println("Enter the lot number:");
          int lotNumber1 = scanner1.nextInt();

          System.out.println("Enter the section number:");
          int sectionNumber1 = scanner1.nextInt();

          System.out.println("Enter the area of the property:");
          double area = scanner1.nextDouble();
          scanner1.nextLine();

          System.out.println("Enter the property name:");
          String name = scanner1.nextLine();

          System.out.println("Enter the name of the owner:");
          String nameOfOwner = scanner1.nextLine();

          propertyRegister.newProperty(municipalityName, municipalityNumber1, lotNumber1, sectionNumber1, name, area, nameOfOwner);
          System.out.println(propertyRegister.printProperties());
          break;
        case LIST_ALL_PROPERTIES:
          System.out.println(propertyRegister.printProperties());
          break;
        case FIND_PROPERTY:
          Scanner scanner2 = new Scanner(System.in);
          System.out.println("Enter the municipality number:");
          int municipalityNumber2 = scanner2.nextInt();
          System.out.println("Enter the lot number:");
          int lotNumber2 = scanner2.nextInt();
          scanner2.nextLine();
          System.out.println("Enter the section number:");
          int sectionNumber2 = scanner2.nextInt();
          System.out.println(propertyRegister.findProperty(municipalityNumber2, lotNumber2, sectionNumber2));
          break;
        case CALCULATE_AVERAGE_AREA:
          System.out.println("Average area of the properties is: " + propertyRegister.averageArea());
          break;
        case FIND_PROPERTIES_LOT_NUMBER:
          Scanner scanner3 = new Scanner(System.in);
          System.out.println("Enter the lot number:");
          int lotNumber3 = scanner3.nextInt();
          System.out.println(propertyRegister.findPropertiesLotNumber(lotNumber3));
          break;
        case EXIT:
          System.out.println("Thank you for using the Properties app!\n");
          finished = true;
          break;
        default:
          System.out.println("Unrecognized menu selected..");
          break;
      }
    }
  }
}
