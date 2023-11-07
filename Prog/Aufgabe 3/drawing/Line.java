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

public class Line implements Drawable {
	private final int xBegin;
	private final int yBegin;
	private final int xEnd;
	private final int yEnd;
	private final Color color;

	public Line(int xBegin, int yBegin, int xEnd, int yEnd, Color color) {
		this.xBegin = xBegin;
		this.yBegin = yBegin;
		this.xEnd = xEnd;
		this.yEnd = yEnd;
		this.color = color;
	}

	/**
	 * @see Drawable#draw(Graphics)
	 */
	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.drawLine(this.xBegin, this.yBegin, this.xEnd, this.yEnd);
	}

	
	@Override
	public String toString() {
		return "Line [xBegin=" + xBegin + ", yBegin=" + yBegin + ", xEnd=" + xEnd + ", yEnd=" + yEnd
				+ ", color=" + color + "]";
	}
}
