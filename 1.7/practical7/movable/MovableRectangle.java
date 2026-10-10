package practical7.movable;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft, bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        if (x1 >= x2 || y1 >= y2) throw new IllegalArgumentException("Неверные углы");
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public boolean SpeedTest() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
                && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }
    private void requireEqualSpeed() {
        if (!SpeedTest()) throw new IllegalStateException("Скорости точек должны совпадать");
    }
    public void moveUp() {
        requireEqualSpeed(); topLeft.moveUp(); bottomRight.moveUp();
    }
    public void moveDown() {
        requireEqualSpeed(); topLeft.moveDown(); bottomRight.moveDown();
    }
    public void moveLeft() {
        requireEqualSpeed(); topLeft.moveLeft(); bottomRight.moveLeft();
    }
    public void moveRight() {
        requireEqualSpeed(); topLeft.moveRight(); bottomRight.moveRight();
    }

    @Override public String toString() {
        return "MovableRectangle{topLeft=" + topLeft + ", bottomRight=" + bottomRight + "}";
    }
}
