package pack;

public class CheckHCN2 {
    public static int getFactors(int n) {
        if (n == 1) {
            return 1;
        }

        int factors = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors;
    }

    public static boolean isHCN(int n) {
        for (int i = 1; i < n; i++) {
            if (getFactors(i) >= getFactors(n)) {
                return false;
            }
        }

        return true;
    }
}
