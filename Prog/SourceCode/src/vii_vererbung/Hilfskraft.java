package vii_vererbung;

public class Hilfskraft extends StudentischeBeziehung {
    private String beschaeftigungszeitraum;

    public Hilfskraft(String vorname, String nachname, String strasse, String hausnummer, int geburtsdatum, int matrikelnumme, int einschreibedatum, String beschaeftigungszeitraum) {
        super(vorname, nachname, strasse, hausnummer, geburtsdatum, matrikelnumme, einschreibedatum);
        this.beschaeftigungszeitraum = beschaeftigungszeitraum;
    }

    public String druckeBeschaeftigung() {
        return "Beschäftigung für: " + nachname + ", " + vorname + " in dem Zeitraum: " + beschaeftigungszeitraum;
    }
}
