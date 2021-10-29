//Kunder erbt von Person (Oberklasse) --> In Klassensignatur erweitert um Oberklasse --> ermöglicht Zugriff von Eigenschaften und Methoden der Oberklassen
public class Kunde extends Person{
    String _kundenNummer;

    //Constructor
    public Kunde (String kundenNummer, String vorname, String nachname, int alter){
        super(vorname, nachname, alter);
        setKundenNummer(kundenNummer);
    }

    public void setKundenNummer(String _kundenNummer) {
        this._kundenNummer = _kundenNummer;
    }
    public String getKundenNummer() {
        return _kundenNummer;
    }
}
