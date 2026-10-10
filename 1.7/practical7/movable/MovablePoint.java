package practical7.movable;

public class MovablePoint implements Movable {
    private int x, y;
    private final int xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x; this.y = y; this.xSpeed = xSpeed; this.ySpeed = ySpeed;
    }
    public int getXSpeed() { return xSpeed; }
    public int getYSpeed() { return ySpeed; }
    public void moveUp() { y -= ySpeed; }
    public void moveDown() { y += ySpeed; }
    public void moveLeft() { x -= xSpeed; }
    public void moveRight() { x += xSpeed; }
    @Override public String toString() {
        return "MovablePoint{x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "}";
    }
}
