package pack;

/**
 * @author Frank Mehler 
 * @version 1.0
 * 10.07.2023
 * Example class for a game used as assignment 3 in Prog I, WI dual HS Mainz, WS 23/24 
 * This class should be changed during own development
 */
import java.awt.Point;
import java.awt.Color;
import pack.drawing.Draw;

public class PlayingField {

	private static final int SIZE = 30; // all gamefields have fixed size 30 x 30

	// symbol for drawing the background of the field
	// see https://www.unicodepedia.com/groups/miscellaneous-symbols-and-arrows/
	private static final char BACKGROUND = '\u25CF';

	private Point positionOfADummy; // position of an object, only for demonstration

	public PlayingField() {
		this.positionOfADummy = new Point(0, 0);
		// your code goes here
		for (int column = 0; column < SIZE; column++) {
			for (int row = 0; row < SIZE; row++) {
				// column is the x-coordinate in the system,
				// row is the y-coordinate
				// your code goes here
			}
		}
	}

	/**
	 * play a complete game
	 * 
	 * @return false if the game is finished, else true if the game should be still
	 *         running
	 */
	public boolean playTheGame() {
		boolean continueGame = true;
		// your code goes here...
		// get the current movement controlled by keyboard events, left arrow or right
		// arrow
		switch (Draw.getDirection()) {
		case RIGHT:
			positionOfADummy.x++; // change movement to the right
			break;
		case LEFT:
			positionOfADummy.x--; // change movement to the left
			break;
		default:
			System.out.println("Error in moving");
		}

		this.printGame();

		return continueGame;
	}

	/**
	 * Print the current status of the game in a drawing window
	 */
	public void printGame() {
		// constants for drawing in the window
		final int SCALING = 10;
		final int OFFSET = 40;

		// Important!!! Clear the screen for a fresh drawing
		Draw.refresh();

		// show some points in the first line
		for (int i = 0; i < SIZE; i++) {
			Draw.drawText(i * SCALING + OFFSET, OFFSET, String.valueOf(BACKGROUND), Color.LIGHT_GRAY);
		}

		System.out.println("x-position of an object: " + positionOfADummy.x + " moving to: " + Draw.getDirection());

		// show the position of a dummy object with red color
		Draw.drawText(positionOfADummy.x * SCALING + OFFSET, OFFSET, String.valueOf(BACKGROUND), Color.RED);
	}
}