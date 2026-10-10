
class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() { return "(" + x + ", " + y + ")"; }
}

class Circle {
    private final Point center;
    private double radius;
    Circle(Point center, double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Радиус должен быть положительным");
        this.center = center;
        this.radius = radius;
    }
    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Радиус должен быть положительным");
        this.radius = radius;
    }

    @Override
    public String toString() { return "Circle{center=" + center + ", radius=" + radius + "}"; }
}

public class Tester {
    private final Circle[] circles;
    private int count;
    Tester(int capacity) {
        circles = new Circle[capacity];
    }

    public void add(Circle circle) {
        if (count == circles.length) throw new IllegalStateException("Массив заполнен");
        circles[count++] = circle;
    }

    public int getCount() {
        return count;
    }

    public Circle[] getCircles() {
        Circle[] result = new Circle[count];
        for (int i = 0; i < count; i++) {
            result[i] = circles[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Tester tester = new Tester(3);
        tester.add(new Circle(new Point(0, 0), 2));
        tester.add(new Circle(new Point(3, 4), 5));
        tester.add(new Circle(new Point(-2, 1), 1.5));
        System.out.println("Количество: " + tester.getCount());
        for (Circle circle : tester.getCircles()) System.out.println(circle);
    }
}
