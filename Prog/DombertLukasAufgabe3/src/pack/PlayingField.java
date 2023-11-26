package pack;

/**
 * @author Frank Mehler
 * @version 1.0
 * 10.07.2023
 * Example class for a game used as assignment 3 in Prog I, WI dual HS Mainz, WS 23/24
 * This class should be changed during own development
 */

import java.awt.Color;

import pack.drawing.Draw;

public class PlayingField {

	private static final int SIZE = 30; // all gamefields have fixed size 30 x 30

	// symbol for drawing the background of the field
	// see https://www.unicodepedia.com/groups/miscellaneous-symbols-and-arrows/
	private static final char BACKGROUND = '\u25CF';

	private Food foodObject;

	private Snake snake;

	final int SCALING = 10;
	final int OFFSET = 40;

	public PlayingField() {
		this.foodObject = new Food();
		this.snake = new Snake();
	}

	public boolean playTheGame() {
		boolean continueGame = true;

		switch (Draw.getDirection()) {
			case RIGHT:
				snake.setX(snake.getX() + 1); //Movement right X-coordinate +1
				break;
			case LEFT:
				snake.setX(snake.getX() - 1); //Movement left X-coordinate -1
				break;
			case TOP:
				snake.setY(snake.getY() - 1); //Movement up Y-coordinate -1
				break;
			case BOTTOM:
				snake.setY(snake.getY() + 1); //Movement down Y-coordinate +1
				break;
			default:
				System.out.println("Error in moving");
		}

		this.printGame();

		if (snake.getX() == this.foodObject.getX() && snake.getY() == this.foodObject.getY()) {
			continueGame = false;
		}

		if (snake.getX() < 0 || snake.getX() >= SIZE || snake.getY() >= SIZE || snake.getY() < 0) {
			continueGame = false;
		}

		return continueGame;
	}

	public void printGame() {
		Draw.refresh();

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++)
				Draw.drawText(i * SCALING + OFFSET, SCALING * j + OFFSET, String.valueOf(BACKGROUND), Color.LIGHT_GRAY);
		}

		System.out.println("x-position of an object: " + snake.getX() + " moving to: " + Draw.getDirection());

		//Show the Position of the Snake
		Draw.drawText(snake.getX() * SCALING + OFFSET, snake.getY() * SCALING + OFFSET, String.valueOf(BACKGROUND), Color.RED);

		Draw.drawText(foodObject.getX() * SCALING + OFFSET, foodObject.getY() * SCALING + OFFSET, String.valueOf(BACKGROUND), Color.GREEN);

		if (snake.getX() == this.foodObject.getX() && snake.getY() == this.foodObject.getY()) {
			Draw.drawText(40, 340, "You win!!!", Color.RED);
		}

		if (snake.getX() < 0 || snake.getX() >= SIZE || snake.getY() >= SIZE || snake.getY() < 0) {
			Draw.drawText(40, 340, "Game Over !!!", Color.RED);
		}
	}
}