package iii_ablaufstrukturen.zusatzaufgaben;

public class SummeVielfachesVonDrei {
    public static void main(String[] args) {
        int sum = 0;
        int currentNumber = 3;
        while (currentNumber <= 100) {
            sum += currentNumber;
            currentNumber += 3;
        }

        System.out.println(sum);
    }
}
