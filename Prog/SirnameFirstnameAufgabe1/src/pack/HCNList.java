package pack;

public class HCNList {
    public static String getHCNList(int n) {
        int m = 1;

        for (int i = 1; m <= n; i++) {
            if (CheckHCN.isHCN(i)) {
                return "HighlyComposite: " + i + " with number of factors: " + CheckHCN.getDividers(i);
            }
        }
        return null;
    }
}
