/**
 * @author Frank Mehler 
 * @version 1.0
 * 25.07.2020
 * Basis-Datenstruktur ist ein Punkt, 
 * bestehend aus x-und y-Koordinate und Farbe
 */
package drawing;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Drawable {
	private final int x;
	private final int y;
	private final int width;
	private final int height;
	private final Color color;

	public Circle(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	/**
	 * @see Drawable#draw(Graphics)
	 */
	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", color=" + color + "]";
	}
}
