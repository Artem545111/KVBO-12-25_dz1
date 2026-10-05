class Ball {
    private double x = 0.0;
    private double y = 0.0;

    Ball() {}
    Ball(double x, double y) { setXY(x, y); }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }
    public void setXY(double x, double y) { this.x = x; this.y = y; }
    public void move(double xDisp, double yDisp) { x += xDisp; y += yDisp; }

    @Override
    public String toString() { return "Ball{x=" + x + ", y=" + y + "}"; }
}

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.setXY(2, 3);
        ball.move(-1, 4);
        System.out.println(ball);
        System.out.println("x=" + ball.getX() + ", y=" + ball.getY());
        ball.setX(10);
        ball.setY(20);
        System.out.println(ball);
        System.out.println(new Ball(5, 6));
    }
}
