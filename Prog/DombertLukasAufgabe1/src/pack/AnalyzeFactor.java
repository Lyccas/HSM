package pack;

public class AnalyzeFactor {
    /**
     * Hier wird eine Zahl n so oft durch einen Faktor geteilt,
     * bis das Ergebnis nicht mehr durch denselben Faktor teilbar ist.
     * Danach wird der Faktor so lange vergroessert bis die Zahl wieder durch ihn teilbar ist.
     * Der Vorgang wiederholt sich so oft, bis die Zahl 1 ist
     */
    public static String analyzeFactors(int n) {
        StringBuilder res = new StringBuilder();

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
                if (n == 1) {
                    res.append("Factor: ").append(factor).append(", current value after div: ").append(n);
                } else {
                    res.append("Factor: ").append(factor).append(", current value after div: ").append(n).append("\n");
                }
                // Hier wird die Ausgabe erstellt
            }
            factor++;
            // Faktor wird hochgezaehlt
        }

        return res.toString();
    }
}