package vii_vererbung;

public class StudentischeBeziehung extends Person {
    private int matrikelnummer;
    private int einschreibedatum;

    public StudentischeBeziehung(String vorname, String nachname, String strasse, String hausnummer, int geburtsdatum, int matrikelnummer, int einschreibedatum) {
        super(vorname, nachname, strasse, hausnummer, geburtsdatum);
        this.matrikelnummer = matrikelnummer;
        this.einschreibedatum = einschreibedatum;
    }

    public String druckeAusweis() {
        return "Ausweis: " + vorname + " " + nachname + " Geburtsdatum: " + geburtsdatum + " Martikelnumme: " + matrikelnummer;
    }
}
