public class Mitarbeiter extends Person{
    String _personalnummer;
    
    
    public Mitarbeiter(String personalnummer, String vorname, String nachname, int alter){
        super(vorname, nachname, alter);
        setPersonalnummer(personalnummer);
    }
    
    public void setPersonalnummer(String personalnummer) {
        this._personalnummer = personalnummer;
    }
    public String getPersonalnummer() {
        return _personalnummer;
    }
}
