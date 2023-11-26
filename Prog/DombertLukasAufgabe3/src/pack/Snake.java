package pack;

public class Snake extends GameObject {
	private int x;
	private int y;

	public Snake() {
		super();
		this.x = 0;
		this.y = 0;
		//Startpoint of the Snake
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public void setY(int y) {
		this.y = y;
	}
}
