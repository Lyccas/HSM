package iii_ablaufstrukturen.zusatzaufgaben;

public class GeradeZahlOhneDurchUndModulo {
    public static void main(String[] args) {
        System.out.println(istGerade(100));
    }

    public static boolean istGerade(int zahl) {
        boolean res = false;
        for (int i = 2; i <= zahl; i += 2) {
            res = zahl == i;
        }
        return res;
    }
}
