/**
 * @author Frank Mehler 
 * @version 1.1
 * 10.07.2023 
 * Goal is to give an easy access for drawing in a window to be more flexible than a console window
 * The class is implemented in a static way in order to have only one Window to write to.
 * In addition the use of this class should be possible without object oriented programming, e.g. in Prog I in the first weeks
 * Implementation uses a Singleton-Pattern.
 */
package drawing;

import java.awt.*;
import javax.swing.*;

public class Draw extends JFrame {
	private static final long serialVersionUID = 1L;
	private static JFrame frame;
	private static DrawObjects allDrawObjects;
	// width and height of the window
	private static final int WIDTH = 400;
	private static final int HEIGHT = 430;

	// current movement of an object controlled by user
	private static Direction currentDirection = Direction.RIGHT;

	// Private constructor for Singleton
	private Draw() {
	}

	/**
	 * Creating the instance of a window if it does not yet exist
	 */
	private static synchronized JFrame getInstance() {
		if (frame == null) {
			frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(WIDTH, HEIGHT);
			frame.addKeyListener(new KeyEventStatus());

			allDrawObjects = new DrawObjects();
			allDrawObjects.setPreferredSize(new Dimension(WIDTH, HEIGHT));
			frame.getContentPane().add(allDrawObjects);
			frame.setVisible(true);
		}
		return frame;
	}

	/**
	 * This method draws a circle at the specified point
	 * 
	 * @param x      x-coordinate of the starting point of the circle
	 * @param y      y-coordinate of the starting point of the circle
	 * @param width Width of the circle
	 * @param height  Height of the circle
	 * @param color  Color of the circle, e.g. Color.BLUE
	 */
	public static void drawCircle(int x, int y, int width, int height, Color color) {
		getInstance();
		allDrawObjects.addCircle(x, y, width, height, color);
	}

	/**
	 * This method draws a line from beginning to end
	 * 
	 * @param xBegin x-coordinate of the beginning of the line
	 * @param yBegin y-coordinate of the beginning of the line
	 * @param xEnd   x-coordinate of end-point
	 * @param yEnd   y-coordinate of end-point
	 * @param color  Color of the line, e.g. Color.BLUE
	 */
	public static void drawLine(int xBegin, int yBegin, int xEnd, int yEnd, Color color) {
		getInstance();
		allDrawObjects.addLine(xBegin, yBegin, xEnd, yEnd, color);
	}

	/**
	 * The method draws a String-text at the specified coordinates
	 * 
	 * @param x     x-coordinate of the text
	 * @param y     y-coordinate of the text
	 * @param text  content of the text
	 * @param color Color of the text, e.g. Color.BLUE
	 */
	public static void drawText(int x, int y, String text, Color color) {
		getInstance();
		allDrawObjects.addText(x, y, text, color);
	}

	/**
	 * @return the width of the window
	 */
	public static int getWidthOfFrame() {
		return WIDTH;
	}

	/**
	 * @return the height of the window
	 */
	public static int getHeightofFrame() {
		return HEIGHT;
	}

	/**
	 * If a keyboard is used, i.e. movement to the left or right via arrows, the new
	 * selected direction is defined
	 * 
	 * @param newDirection the direction selected by the user of the window
	 */
	public static void setDirection(Direction newDirection) {
		currentDirection = newDirection;
	}

	/**
	 * If a keyboard is used, i.e. movement to the left or right via arrows, this
	 * method gives the last selected direction of the keyboard, e.g. RIGHT or LEFT
	 * direction
	 * 
	 * @return currentDirection
	 */
	public static Direction getDirection() {
		return currentDirection;
	}

	/**
	 * Remove all previously created drawable objects for a clean white screen
	 */
	public static void refresh() {
		getInstance();
		allDrawObjects.deleteDrawableObjects();
	}
}
