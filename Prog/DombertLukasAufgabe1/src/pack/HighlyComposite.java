package pack;

/**
 * Lukas Dombert
 * 09.10.2023
 * V1.0.0
 */

public class HighlyComposite {
    public static int Divisors(int n) {
        if (n == 1) {
            return 1;
        }

        int divisors = 1;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                divisors++;
            }
        }

        return divisors;
    }

    public static boolean isHCN(int n) {
        for (int i = 1; i < n; i++) {
            if (Divisors(i) >= Divisors(n)) {
                return false;
            }
        }

        return true;
    }

    public static void getHCNList(int n) {
        int lastHCN = 0;
        for (int i = 1; i <= n; i++) {
            int currentNumber = lastHCN;
            boolean foundHCN = false;
            while (!foundHCN) {
                if (currentNumber > lastHCN) {
                    if (isHCN(currentNumber)) {
                        System.out.println("HighlyComposite: " + currentNumber + " with number of factors: " + Divisors(currentNumber));
                        lastHCN = currentNumber;
                        foundHCN = true;
                    }
                }
                currentNumber++;
            }
        }
    }

    public static void analyzeFactors(int n) {
        int factor = 2;

        while (n > 1) {
            while (n % factor == 0) {
                n = n / factor;
                System.out.println("Factor: " + factor + ", current calue after div: " + n);
            }
            factor++;
        }
    }

    public static void genOutput(int t1n1, int t1n2, int t2, int t3) {
        System.out.println("Is the number " + t1n1 + " HCN? " + isHCN(t1n1));
        System.out.println("Is the number " + t1n2 + " HCN? " + isHCN(t1n2));
        System.out.println("-".repeat(50));
        getHCNList(t2);
        System.out.println("-".repeat(50));
        System.out.println("Analyze factors for " + t3);
        analyzeFactors(t3);
    }

    public static void main(String[] args) {
        final int TASK1_NUMBER1 = 840;
        final int TASK1_NUMBER2 = 830;
        final int TASK2 = 13;
        final int TASK3 = 840;
        genOutput(TASK1_NUMBER1, TASK1_NUMBER2, TASK2, TASK3);
    }
}