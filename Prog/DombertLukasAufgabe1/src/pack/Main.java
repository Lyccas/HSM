package pack;

public class Main {
    public static void main(String[] args) {
        HighlyComposite.checkHCN840();
        HighlyComposite.checkHCN830();
        System.out.println("-".repeat(50));
        HCNList.printHCN(1);
        System.out.println("-".repeat(50));
        AnalyzeFactor.analyzeFactors(840);
    }
}