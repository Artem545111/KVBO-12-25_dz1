import java.util.Random;
import java.util.Scanner;

public class MathRandomTasks {
    private static final Random RANDOM = new Random();

    // задание 1: оба способа генерации вещественных чисел.
    private static void task1() {
        double[] viaMath = new double[8];
        double[] viaRandom = new double[8];
        for (int i = 0; i < viaMath.length; i++) {
            viaMath[i] = Math.random() * 100;
            viaRandom[i] = RANDOM.nextDouble() * 100;
        }
        showAndSort("Math.random()", viaMath);
        showAndSort("Random", viaRandom);
    }

    private static void showAndSort(String title, double[] values) {
        System.out.print(title + " до: ");
        print(values);
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[i]) {
                    double temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
        System.out.print(title + " после: ");
        print(values);
    }

    private static void print(double[] values) {
        for (double value : values) System.out.printf("%.2f ", value);
        System.out.println();
    }

    private static void print(int[] values) {
        for (int value : values) System.out.print(value + " ");
        System.out.println();
    }

    // задание 3: строгое возрастание означает a[i] > a[i - 1].
    private static void task3() {
        int[] values = new int[4];
        for (int i = 0; i < values.length; i++) values[i] = 10 + RANDOM.nextInt(90);
        boolean increasing = true;
        for (int i = 1; i < values.length; i++) {
            if (values[i] <= values[i - 1]) {
                increasing = false; break;
            }
        }
        System.out.print("Массив: ");
        print(values);
        System.out.println(increasing ? "Строго возрастает" : "Не является строго возрастающим");
    }

    // задание 4
    private static void task4(Scanner scanner) {
        int n;
        while (true) {
            System.out.print("Введите натуральное n (> 0): ");
            try {
                n = Integer.parseInt(scanner.nextLine().trim());
                if (n > 0) break;
            } catch (NumberFormatException ignored) {}
            System.out.println("Нужно целое число больше нуля.");
        }
        int[] values = new int[n];
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            values[i] = RANDOM.nextInt(n + 1);
            if (values[i] % 2 == 0) evenCount++;
        }
        int[] evens = new int[evenCount];
        for (int i = 0, j = 0; i < n; i++) if (values[i] % 2 == 0) evens[j++] = values[i];
        System.out.print("Исходный массив: ");
        print(values);
        System.out.print("Чётные элементы: ");
        print(evens);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1:"); task1();
        System.out.println("Задание 3:"); task3();
        System.out.println("Задание 4:"); task4(scanner);
    }
}
