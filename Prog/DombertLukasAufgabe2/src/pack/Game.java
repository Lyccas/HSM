package pack;

import java.util.Random;

public class Game {
    public static double getRandomNumber() {
        Random random = new Random();
        return random.nextDouble();
    }

    public static String checkWinner(double aFTPercentage, double bFTPercentage) {
        String name = null;
        boolean winner = false;
        while (!winner) {
            for (int i = 1; i <= 2; i++) {
                double number = getRandomNumber();
                if (i == 1) {
                    if (number <= bFTPercentage) {
                        name = "Ben";
                        winner = true;
                        break;
                    }
                } else {
                    if (number <= aFTPercentage) {
                        name = "Anna";
                        winner = true;
                        break;
                    }
                }
            }
        }
        return name;
    }

    public static void simulationWinningRate(double aFTPercentage, double bFTPercentage, int games) {
        double winAnna = 0;
        double winRateAnna;
        double winBen = 0;
        double winRateBen;
        for (int i = 1; i < games; i++) {
            if (checkWinner(aFTPercentage, bFTPercentage).equals("Anna")) {
                winAnna++;
            } else if (checkWinner(aFTPercentage, bFTPercentage).equals("Ben")) {
                winBen++;
            }
        }

        winRateAnna = Math.round(winAnna / games * 100 * 100) / 100.0;
        winRateBen = Math.round(winBen / games * 100 * 100) / 100.0;

        System.out.println("Success rate of each player");
        System.out.println(winRateAnna + "% success rate for player A");
        System.out.println(winRateBen + "% success rate for player B");
    }
}
