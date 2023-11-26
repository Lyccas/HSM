package pack;

/**
 * @author Frank Mehler
 * @version 1.0
 * 10.07.2023
 * Main program for assignment 3 in Prog I, WI dual HS Mainz, WS 23/24
 */

import java.util.Timer;
import java.util.TimerTask;

public class Main extends TimerTask {
	private int time; // counter for time
	private PlayingField gameField; // playground

	public Main() {
		this.time = 0;
		this.gameField = new PlayingField();
	}

	/**
	 * This method is automatically executed again and again by the Timer Here,
	 * every run consists of one time-step of the game until it is finished
	 */
	@Override
	public void run() {
		time++;
		System.out.println("Time: " + time);
		boolean continueGame = this.gameField.playTheGame();
		if (!continueGame)
			this.cancel(); // cancel the timer task, end of game
	}

	public static void main(String[] args) {
		Main task = new Main();

		// execute task every 500ms
		final int TIME_BETWEEN_RUNS = 500; // ms
		new Timer().scheduleAtFixedRate(task, 0, TIME_BETWEEN_RUNS);
	}
}
