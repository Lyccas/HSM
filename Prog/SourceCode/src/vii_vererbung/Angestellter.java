package vii_vererbung;

public class Angestellter extends Person {
    private double gehalt;
    private String iban;
    private double kontostand;

    public Angestellter(String vorname, String nachname, String strasse, String hausnummer, int geburtsdatum, double gehalt, String iban) {
        super(vorname, nachname, strasse, hausnummer, geburtsdatum);
        this.gehalt = gehalt;
        this.iban = iban;
    }

    public void ueberweiseGehalt() {
        kontostand += gehalt;
    }
}