package pack;

/**
 * Lukas Dombert
 * 09.10.2023
 * Berechnung der Faktoren, wie oft eine Zahl teilbar ist
 * Ueberpruefung, ob eine Zahl die kleinste Zahl mit den meisten Teilern ist
 */

public class CheckHCN {
    /**
     * Hier wird berechnet, wie oft eine Zahl teilbar ist
     */
    public static int Divisors(int a) {
        if (a == 1) {
            return 1;
        }
        // Sollte a = 1 sein, wird 1 zurueckgegeben, da 1 nur einen Teiler hat

        int factor = 2;
        for (int i = 2; i * i <= a; i++) {
        /*
         * Solange i * i nicht kleiner oder gleich der Ursprungszahl ist,
         * soll die Schleife laufen
         */
            if (a % i == 0) {
            // Ueberpruefen, ob die Zahl durch den Faktor i teilbar ist
                if (i * i != a) {
                    factor += 2;
                } else {
                    factor++;
                }
            }
        }
        return factor;
        // Rueckgabe der Teiler
    }

    /**
     * Hier wird ueberprueft, ob die Zahl die kleinste Zahl mit den meisten Teilern hat
     */
    public static boolean isHCN(int n) {
        int initial = Divisors(n);
        // Die Anzahl der Teiler, von der Zahl, die angegeben wurde, werden ermittelt
        for (int i = 1; i < n; i++) {
        // Die Schleife laeuft so lange, bis alle Zahlen ueberprueft worden sind
            if (Divisors(i) >= initial) {
            // Hier wird ueberprueft, ob die Zahl gleich viele oder weniger Teiler hat
                return false;
                // Der return Wert wird auf false gesetzt, da die Zahl gleich viele oder weniger Teiler hat
            }
        }

        return true;
        /*
         * Sollte die Zahl mehr Teiler haben oder kleiner und gleich viele Teiler haben als die Ausgangszahl,
         * wird der return Wert auf true gesetzt
         */
    }
}