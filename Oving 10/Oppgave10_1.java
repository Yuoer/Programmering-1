public class Oppgave10_1 {
  public static void main(String[] args) {
    ArrangementRegister arrangementer = new ArrangementRegister();
    arrangementer.nyttArrangement(100, "Astrid S", "Trondheim", "UKA", "Konsert", 202311072000L);
    arrangementer.nyttArrangement(101, "Undergrunn", "Oslo", "Telenor", "Konsert", 202311071900L);
    arrangementer.nyttArrangement(102, "Coldplay", "Oslo", "Telenor", "Konsert", 202311051900L);
    arrangementer.nyttArrangement(104, "Oktoberfest", "Trondheim", "UKA", "Fest", 202311102000L);
    arrangementer.nyttArrangement(105, "Silent disco", "Bergen", "Accenture", "Disco", 202311081900L);
    arrangementer.nyttArrangement(106, "Festningen", "Trondheim", "Festningen", "Festival", 202311031900L);

    while (true) {
      arrangementer.visMeny();
    }


  }
}
