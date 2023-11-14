import java.util.*; 

class oppgave4_1 {
	private static Valuta[] valuta = new Valuta[3];


	public static void main(String[] args) {

		valuta[0] = new Valuta(10.81f, "dollar");   //Legger til valuta og kursen i forhold til nok
		valuta[1] = new Valuta(11.55f, "euro");
		valuta[2] = new Valuta(0.97f, "svenske kroner");

        meny();     //Kjører meny
	}

  public static void meny() {
    Scanner in1 = new Scanner(System.in);
    System.out.println("1: konvertere fra norske kroner \n2: konvertere til norske kroner");
    int konverterInput = in1.nextInt(); //Spør brukeren om man vil konvertere fra eller til, tar inn valgtallet og gjør det til int

    if(konverterInput != 1 && konverterInput != 2){      //Sjekker at inputet er gyldig
        System.out.println("Du må taste inn enten 1 eller 2");
        meny();
    }

    Scanner in2 = new Scanner(System.in);
    System.out.println("Velg valuta: \n 1: euro \n 2: dollar \n 3:svenske kroner \n 4: avslutt");
    int menyInput = in2.nextInt();  //Spør brukeren om hvilken valuta man vil konvertere med, og gir muligheten til å avslutte programmet

    if (menyInput == 4) {   //Hvis avslutt blir valgt avsluttes programmet
      System.out.println("Programmet ble avsluttet");
      System.exit(0);
    }
    else if (menyInput != 1 && menyInput != 2 && menyInput != 3) { //Om et ugyldig tall er valgt spørres brukeren om å prøve på nytt
      System.out.println("Du må taste inn et tall mellom 1 og 4");
      meny();
      return;
    }
    else{
	    kalkuler(menyInput, konverterInput);  //Har brukeren oppgitt et gyldig tall kjøres kalkuler
	}
  }

  public static void kalkuler(int id, int fraTil) {

    Scanner in = new Scanner(System.in);
    System.out.println("Hvor mye?");
    float antall = in.nextFloat();   //Spør brukeren om hvor mye som skal konverteres

    System.out.println(Valuta.regnUt(antall, fraTil, valuta[(id - 1)]));  //Sender verdiene videre til regnUt
    System.out.println("");
    System.out.println("");

	meny(); //Starter programmet på nytt for brukeren
  }
}