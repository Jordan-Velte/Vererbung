import java.util.*;
public class App {

    public static void main(String[] args) throws Exception {
        //ArrayList
        ArrayList<Kunde> kunden = new ArrayList<Kunde>();
        ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
        ArrayList<Azubi> azubi = new ArrayList<Azubi>();


        //Oberklasse automatisch in Parameterübergabe erfasst
        //Auf Array verzichtet, weil nur ein Objekt einer Klasse erstellt
        Kunde k1 = new Kunde("415", "Bernd", "Müller", 16);
        Kunde k2 = new Kunde("413", "Gert", "Temp", 20);
        //Weil Kunde eine Subklasse von Person ist, können wir über die Punktnotation eben auch am Objekt die Methoden und Eigenschaften der Oberklasse aufrufen.
        //Oberklasse weiß nicht an welche Klasse sie vererbt
        //Der Parameter initialisiert die Variable extraData --> getKundenummer! (Eigenschaft von der Subklasse Kunde)
        kunden.add(k1);
        kunden.add(k2);
        //For-Each Schleife für Array List--> damit man nur einmal programmieren muss!
        for (Kunde k : kunden){
            k.printDaten(k.getKundenNummer());
        }
        //Mitarbeiter:
        Mitarbeiter m1 = new Mitarbeiter("61", "Thomas", "Grind", 9);
        Mitarbeiter m2 = new Mitarbeiter("63", "Heinz", "Pferd", 81);
        mitarbeiter.add(m1);
        mitarbeiter.add(m2);
        for (Mitarbeiter m : mitarbeiter){
            m.printDaten(m.getPersonalnummer());
        }

        //Azubis:
        Azubi a1 = new Azubi("2020", "Gustav", "Jung", 18);
        Azubi a2 = new Azubi("2021", "Peter", "Schnell", 17);
        azubi.add(a1);
        azubi.add(a2);
        for (Azubi a : azubi){
            a.printDaten(a.getJahrgang());
        }
    }
}
