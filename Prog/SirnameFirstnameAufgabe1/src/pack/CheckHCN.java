package pack;

public class CheckHCN {
    public static int getDividers(int n) {
        int dividers = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dividers++;
            }
        }

        return dividers;
    }

    public static boolean isHCN(int n) {
        int nDividers = getDividers(n);

        for (int i = 1; i < n; i++) {
            if (getDividers(i) >= nDividers) {
                return false;
            }
        }

        return true;
    }
}
