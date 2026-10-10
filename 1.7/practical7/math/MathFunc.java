package practical7.math;

public class MathFunc implements MathCalculable {
    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    public double absComplex(double real, double imaginary) {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }
    public double circleLength(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Радиус не может быть отрицательным");
        return 2 * PI * radius;
    }
}
