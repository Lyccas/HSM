package vii_vererbung;

public class Person {
    protected String vorname;
    protected String nachname;
    private String strasse;
    private String hausnummer;
    protected int geburtsdatum;

    public Person(String vorname, String nachname, String strasse, String hausnummer, int geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.geburtsdatum = geburtsdatum;
    }

    public String druckeAdress() {
        return "Adresse: " + strasse + " " + hausnummer;
    }
}
