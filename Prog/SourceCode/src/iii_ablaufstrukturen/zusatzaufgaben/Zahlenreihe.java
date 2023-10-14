package iii_ablaufstrukturen.zusatzaufgaben;

public class Zahlenreihe {
    public static void main(String[] args) {
        int currenNumber = 1;
        int addition = 1;
        while (addition <= 100) {
            System.out.println(currenNumber);
            currenNumber += addition;
            addition++;
        }
    }
}
