package pack;

import java.awt.Point;

public class GameObject {
	protected static Point gameObject;

	public GameObject() {
		GameObject.gameObject = new Point(0, 0); // set GameObject to
	}

	public int getX() {
		return gameObject.x;
	}

	public void setX(int x) {
		GameObject.gameObject.x = x;
	}

	public int getY() {
		return gameObject.y;
	}

	public void setY(int y) {
		GameObject.gameObject.y = y;
	}

}