package pack;

public class HighlyComposite {
    public static String analyzeFactors(int n) {
        int factor = 2;
        // Startfaktor festlegen

        System.out.println("Analyze factors for " + n);

        while (n > 1) {
            // Schleife soll so lange laufen, wie n groesser als 1 ist
            while (n % factor == 0) {
                // Schleife soll so lange laufen, wie n noch durch denselben Faktor teilbar ist
                n = n / factor;
                /*
                 * Hier wird der alte Wert von n mit dem neuen Wert von n ueberschrieben,
                 * da hier die Zahl n durch den Faktor geteilt wird
                 */
                return "Factor: " + factor + ", current value after div: " + n;
                // Hier wird die Ausgabe erstellt
            }
            factor++;
            // Faktor wird hochgezaehlt
        }
        return null;
    }
}
