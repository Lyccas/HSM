package vii_vererbung;

public class Student extends StudentischeBeziehung {
    public Student(String vorname, String nachname, String strasse, String hausnummer, int geburtsdatum, int matrikelnummer, int einschreibedatum) {
        super(vorname, nachname, strasse, hausnummer, geburtsdatum, matrikelnummer, einschreibedatum);
    }
}
