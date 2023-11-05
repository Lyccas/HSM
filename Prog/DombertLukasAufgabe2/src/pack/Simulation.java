package pack;

import java.util.Random;

public class Simulation {
    public static float fta;

    public static double getRandomNumber() {
        Random random = new Random();
        return random.nextDouble();
    }

    public static String checkWinner(double aFTPercentage, double bFTPercentage) {
        while (true) {
            for (int i = 1; i <= 2; i++) {
                fta++;
                double number = getRandomNumber();
                if (i == 1) {
                    if (number <= bFTPercentage) {
                        return "Ben";
                    }
                } else {
                    if (number <= aFTPercentage) {
                        return "Anna";
                    }
                }
            }
        }
    }

    public static String successRate(double aFTPercentage, double bFTPercentage, int games) {
        double winAnna = 0;
        double winRateAnna;
        double winBen = 0;
        double winRateBen;

        String winner;

        for (int i = 1; i <= games; i++) {
            winner = checkWinner(aFTPercentage, bFTPercentage);
            if (winner.equals("Anna")) {
                winAnna++;
            } else if (winner.equals("Ben")) {
                winBen++;
            }
        }

        winRateAnna = Math.round(winAnna / games * 100 * 100) / 100.0;
        winRateBen = Math.round(winBen / games * 100 * 100) / 100.0;

        return "Success rate of each player\n" + winRateAnna + "% success rate for player A\n" + winRateBen + "% success rate for player B";
    }

    public static String avgLength(int games) {
        double avgLenght;

        avgLenght = Math.round(fta / games * 10000) / 10000.0;

        return "Average length of a game \nAverage number of shots per games is " + avgLenght;
    }

    public static void genOutput(double aFTPercentage, double bFTPercentage, int games) {
        System.out.println(successRate(aFTPercentage, bFTPercentage, games));
        System.out.println("-".repeat(50));
        System.out.println(avgLength(games));
    }

    public static void main(String[] args) {
        final double AFTPERCENTAGE = 0.7;
        final double BFTPERCENTAGE = 0.4;
        final int GAMES = 100000;
        genOutput(AFTPERCENTAGE, BFTPERCENTAGE, GAMES);
    }
}
