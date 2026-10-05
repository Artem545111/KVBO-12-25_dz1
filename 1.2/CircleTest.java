class Circles {
    private double x, y, radius;
    private String color;
    Circles(double x, double y, double radius, String color) {
        this.x = x;
        this.y = y;
        setRadius(radius);
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Радиус должен быть положительным");
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public int compareArea(Circles other) {
        return Double.compare(getArea(), other.getArea());
    }

    @Override
    public String toString() {
        return "Circle{x=" + x + ", y=" + y + ", radius=" + radius + ", color='" + color + "'}";
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circles a = new Circles(0, 0, 2, "красный");
        Circles b = new Circles(1, 1, 3, "синий");
        System.out.println(a + ": площадь=" + a.getArea() + ", длина=" + a.getCircumference());
        System.out.println(b + ": площадь=" + b.getArea() + ", длина=" + b.getCircumference());

        int result = a.compareArea(b);

        if (result < 0) {
            System.out.println("первое < второго");
        } else if (result > 0) {
            System.out.println("первое > второго");
        } else {
            System.out.println("площади равны");
        }

        a.setRadius(4);
        a.setColor("зелёный");
        System.out.println("После изменения: " + a);
    }
}
