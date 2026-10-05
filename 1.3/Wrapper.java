public class Wrapper {
    public static void main(String[] args) {
        Double boxed = Double.valueOf(65.5);
        double parsed = Double.parseDouble("7.25");

        System.out.println("Double.valueOf(double): " + boxed);
        System.out.println("Double.parseDouble(String): " + parsed);
        System.out.println("byte: " + boxed.byteValue());
        System.out.println("short: " + boxed.shortValue());
        System.out.println("int: " + boxed.intValue());
        System.out.println("long: " + boxed.longValue());
        System.out.println("float: " + boxed.floatValue());
        System.out.println("double: " + boxed.doubleValue());
        // У Double нет charValue() и booleanValue(); эти значения выводим отдельно.
        char character = (char) boxed.intValue();
        boolean nonZero = boxed.doubleValue() != 0.0;
        System.out.println("char (через числовое приведение): " + character);
        System.out.println("boolean (через сравнение с нулём): " + nonZero);
        String text = Double.toString(3.14);
        System.out.println("Строка: " + text);
    }
}
