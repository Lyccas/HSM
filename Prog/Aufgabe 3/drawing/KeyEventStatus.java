/**
 * @author Frank Mehler 
 * @version 1.0
 * 10.07.2023 
 * Goal is to receive keyboard events (e.g. arrow to the left, to the top etc.) 
 * and to transform these keyboard events in directions LEFT, TOP etc.
 */
package drawing;

import java.awt.event.*;

public class KeyEventStatus extends KeyAdapter {
	
	/**
	 * after the key on the keyboard is released, 
	 * the selected direction is stored in the attribute of the Draw class
	 * only the 4 arrow keys are supported
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("KeyCode: " + e.getKeyCode());
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			Draw.setDirection(Direction.LEFT);
			break;
		case KeyEvent.VK_UP:
			Draw.setDirection(Direction.TOP);
			break;
		case KeyEvent.VK_RIGHT:
			Draw.setDirection(Direction.RIGHT);
			break;
		case KeyEvent.VK_DOWN:
			Draw.setDirection(Direction.BOTTOM);
			break;
		default:
			Draw.setDirection(Direction.NONE);
			System.out.println("Keyboard event not supported for setting direction in package drawing, class KeyEventStatus");
		}
	}
}
