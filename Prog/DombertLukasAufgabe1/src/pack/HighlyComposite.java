/**
 * Lukas Dombert
 * 05.11.2023, V1.0.0
 * This class checks how many divisors a number has, whether a number is HCN, outputs a list of the first "n" HCNs
 * and checks how many factors a number has and outputs them
 */

package pack;

public class HighlyComposite {
	/**
	 * This method determines the number of divisors of a number
	 *
	 * @param n Number from which the dividers are to be checked
	 * @return Returns the number of divisors
	 */
	public static int Divisors(int n) {
		if (n == 1) {
			return 1; // The number 1 always has only one divisor (itself)
		}

		int divisors = 1;

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				divisors++;
			}
		}

		return divisors;
	}

	/**
	 * The method checks whether a number is HCN
	 *
	 * @param n The number to be checked to see if it is HCN
	 * @return Returns whether a number is HCN or not
	 */
	public static boolean isHCN(int n) {
		for (int i = 1; i < n; i++) {
			if (Divisors(i) >= Divisors(n)) {
				return false;
				// If a number has the same number of divisors or more, this number is not HCN
			}
		}

		return true;
	}

	/**
	 * This method outputs a list of the first "n" HCNs
	 *
	 * @param n Number of HCNs to be output
	 */
	public static void getHCNList(int n) {
		int lastHCN = 0;
		for (int i = 1; i <= n; i++) {
			int currentNumber = lastHCN;
			boolean foundHCN = false;
			while (!foundHCN) {
				if (currentNumber > lastHCN) {
					if (isHCN(currentNumber)) {
						System.out.println("HighlyComposite: " + currentNumber + " with number of factors: "
								+ Divisors(currentNumber));
						lastHCN = currentNumber;
						foundHCN = true;
					}
				}
				currentNumber++;
			}
		}
	}

	/**
	 * This method looks at how many factors a number has and what they are
	 *
	 * @param n The number to be checked, how many factors it has and which
	 */
	public static void analyzeFactors(int n) {
		int factor = 2;

		while (n > 1) {
			while (n % factor == 0) {
				n = n / factor;
				System.out.println("Factor: " + factor + ", current calue after div: " + n);
			}
			factor++;
			/*
			 * If a number can no longer be divided by the same factor, the factor is
			 * increased until the factor is equal to the remaining number
			 */
		}
	}

	/**
	 * This method only outputs the previous methods so that you only have to call
	 * one method in the Main
	 *
	 * @param t1n1 This number is the first number to be checked to see if it is HCN
	 * @param t1n2 This number is the second number to be checked to see if it is
	 *             HCN
	 * @param t2   This number is the number of the first HCNs to be output
	 * @param t3   The factors are to be output from this number
	 */
	public static void genOutput(int t1n1, int t1n2, int t2, int t3) {
		System.out.println("Is the number " + t1n1 + " HCN? " + isHCN(t1n1));
		System.out.println("Is the number " + t1n2 + " HCN? " + isHCN(t1n2));
		System.out.println("-".repeat(50));
		getHCNList(t2);
		System.out.println("-".repeat(50));
		System.out.println("Analyze factors for " + t3);
		analyzeFactors(t3);
	}

	public static void main(String[] args) {
		final int TASK1_NUMBER1 = 840;
		// This number is the first number to be checked to see if it is HCN
		final int TASK1_NUMBER2 = 830;
		// This number is the second number to be checked to see if it is HCN
		final int TASK2 = 13;
		// This number is the number of the first HCNs to be output
		final int TASK3 = 840;
		// The factors are to be output from this number
		genOutput(TASK1_NUMBER1, TASK1_NUMBER2, TASK2, TASK3);
	}
}