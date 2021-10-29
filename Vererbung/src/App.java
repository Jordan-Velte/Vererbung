public class App {
    //Array
    static Kunde[] _kunde;
    static Mitarbeiter[] _mitarbeiter;
    public static Kunde[] getALLKunde(){
        return _kunde;
    }
    public static Mitarbeiter[] getALLMitarbeiter(){
        return _mitarbeiter;
    }
    public static void main(String[] args) throws Exception {
        //Oberklasse automatisch in Parameterübergabe erfasst
        //Auf Array verzichtet, weil nur ein Objekt einer Klasse erstellt
        _kunde = new Kunde[30];
        _mitarbeiter = new Mitarbeiter[30];
        _kunde[0] = new Kunde("415", "Bernd", "Müller", 16);
        //Weil Kunde eine Subklasse von Person ist, können wir über die Punktnotation eben auch am Objekt die Methoden und Eigenschaften der Oberklasse aufrufen.
        //Oberklasse weiß nicht an welche Klasse sie vererbt
        //Der Parameter initialisiert die Variable extraData --> getKundenummer! (Eigenschaft von der Subklasse Kunde)
        _kunde[0].printDaten(_kunde[0].getKundenNummer());
        _mitarbeiter[0] = new Mitarbeiter("61", "Thomas", "Grind", 9);
        _mitarbeiter[0].printDaten(_mitarbeiter[0].getPersonalnummer());
    }
}
