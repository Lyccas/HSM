package pack;

public class HCNList {
    public static void getHCNList(int n) {
        int lastHCN = 0;
        int currentNumber;

        for (int i = 1; i <= n; i++) {
            currentNumber = lastHCN;
            while (true) {
                if (CheckHCN.isHCN(currentNumber)) {
                    if (currentNumber > lastHCN) {
                        System.out.println("HighlyComposite: " + currentNumber + " with number of facotrs: " + CheckHCN.getDividers(currentNumber));
                        lastHCN = currentNumber;
                        break;
                    }
                }

                currentNumber++;
            }
        }
    }
}
