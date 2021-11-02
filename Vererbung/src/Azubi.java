public class Azubi extends Person {
    String _jahrgang;
    //Constructor
    public Azubi (String jahrgang, String vorname, String nachname, int alter){
        super(vorname, nachname, alter);
        setJahrgang(jahrgang);
    }

    public void setJahrgang(String jahrgang) {
        this._jahrgang = jahrgang;
    }
    public String getJahrgang() {
        return _jahrgang;
    }
}
