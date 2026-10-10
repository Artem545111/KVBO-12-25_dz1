package practical7.math;

public class MathFuncDemo {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        System.out.println("2^5 = " + mc1.pow(2, 5));
        System.out.println("|3 + 4i| = " + mc1.absComplex(3, 4));
        MathFunc math = (MathFunc) mc1;
        System.out.println("Длина окружности r=3: " + math.circleLength(3));
    }
}
