package pack;

public class HCNList {
    public static String getHCNList(int n) {
        StringBuilder res = new StringBuilder();
        int lastHCN = 0;
        for (int i = 1; i <= n; i++) {
            int k = lastHCN;
            while (true) {
                if (CheckHCN.isHCN(k)) {
                    if (k > lastHCN) {
                        if (i == n) {
                            res.append("HighlyComposite: ").append(k).append(" with number of factors: ").append(CheckHCN.Divisors(k));
                        } else {
                            res.append("HighlyComposite: ").append(k).append(" with number of factors: ").append(CheckHCN.Divisors(k)).append("\n");
                        }
                        lastHCN = k;
                        break;
                    }
                }
                k++;
            }
        }

        return res.toString();
    }
}
