/**
 * Lukas Dombert
 * 05.11.2023, V1.0.0
 * In this class, a free throw game is simulated. There are 2 players who have different probabilities of scoring.
 * First a random number is generated, then it is determined who wins the game.
 * In addition, a simulation should be created to see how high the players' probability of winning is and how many throws they need on average.
 */

package pack;

import java.util.Random;

public class Simulation {
	public static float fta; // Number of free throws

	/**
	 * Generating a random number
	 *
	 * @return returns the random number
	 */
	public static double getRandomNumber() {
		Random random = new Random();
		return random.nextDouble();
	}

	/**
	 * See which player has won. If the random number is less than or equal to the
	 * probability of hitting, that person has hit
	 *
	 * @param aFTPercentage The probability of player A scoring
	 * @param bFTPercentage The probability of player B scoring
	 * @return Returns the name of the winner
	 */
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

	/**
	 * A simulation is created here to see how high the probability of winning is
	 *
	 * @param aFTPercentage The probability of player A scoring
	 * @param bFTPercentage The probability of player B scoring
	 * @param games         The number of runs
	 * @return Returns the probability of winning
	 */
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

		return "Success rate of each player\n" + winRateAnna + "% success rate for player A\n" + winRateBen
				+ "% success rate for player B";
	}

	/**
	 * A simulation is created here to see how often you have to throw on average to
	 * score
	 *
	 * @param games The number of runs
	 * @return Returns the average of the throws
	 */
	public static String avgLength(int games) {
		double avgLenght;

		avgLenght = Math.round(fta / games * 10000) / 10000.0;

		return "Average length of a game \nAverage number of shots per games is " + avgLenght;
	}

	/**
	 * This method only outputs the previous methods so that you only have to call
	 * one method in the Main
	 *
	 * @param aFTPercentage The probability of player A scoring
	 * @param bFTPercentage The probability of player B scoring
	 * @param games         The number of runs
	 */
	public static void genOutput(double aFTPercentage, double bFTPercentage, int games) {
		System.out.println(successRate(aFTPercentage, bFTPercentage, games));
		System.out.println("-".repeat(50));
		System.out.println(avgLength(games));
	}

	public static void main(String[] args) {
		final double AFTPERCENTAGE = 0.7;
		// The probability of player A scoring
		final double BFTPERCENTAGE = 0.4;
		// The probability of player B scoring
		final int GAMES = 100000;
		// The number of runs
		genOutput(AFTPERCENTAGE, BFTPERCENTAGE, GAMES);
	}
}
