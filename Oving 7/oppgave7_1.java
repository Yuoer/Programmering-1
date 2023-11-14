public class oppgave7_1 {

    public static void main(String[] args) {
        NyString tekst = new NyString("Hei, jeg heter August");

        System.out.println(tekst.forbokstaver());
        System.out.println(tekst.fjernBokstav("e"));
    }
}

