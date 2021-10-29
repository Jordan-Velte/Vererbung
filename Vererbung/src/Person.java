public class Person {
    String _vorname;
    String _nachname;
    int _alter;

    public Person(String vorname, String nachname, int alter){
        setAlter(alter);
        setNachname(nachname);
        setVorname(vorname);
    }

    public void setAlter(int _alter) {
        this._alter = _alter;
    }
    /* Oder man macht es so:
    public void set_alter(int alter) {
        _alter = alter;
    }
    */

    public void setNachname(String _nachname) {
        this._nachname = _nachname;
    }
    public void setVorname(String _vorname) {
        this._vorname = _vorname;
    }
    public int getAlter() {
        return _alter;
    }
    public String getNachname() {
        return _nachname;
    }
    public String getVorname() {
        return _vorname;
    }

    //Nicht so gut: 
    /*
    public void printDaten(){
        System.out.println(_vorname);
        System.out.println(_nachname);
        System.out.println(_alter);
    }
    */
    //Besser (Herr Trampe Lösung):
    //Parameter zusätzlich --> diesen bekommt man von den Unterklassen durch Punktnotation an den Objekten
    //Müssen nur einmal ändern, dann gilt das für alle vererbten Klassen --> Man schreibt alles einmal, weniger fehleranfällig
    public void printDaten(String extraData){
        System.out.println("Daten der Person: " + this.getVorname() + " " + this.getNachname() + " " + this.getAlter() + " " + extraData);
    }

}
