package pack;

public class Food extends GameObject {
    private int x;

    private int y;

    public Food() {
        super();
        this.x = 15;
        this.y = 15;
        //Startpoint of the food Object
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
