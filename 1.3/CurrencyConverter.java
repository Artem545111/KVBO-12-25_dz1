import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сумма в исходной валюте: ");
        double amount = readPositive(scanner);
        System.out.print("Код исходной валюты (например, RUB): ");
        String from = scanner.nextLine().trim().toUpperCase(Locale.ROOT);
        System.out.print("Код целевой валюты (например, USD): ");
        String to = scanner.nextLine().trim().toUpperCase(Locale.ROOT);
        System.out.print("Курс: сколько " + to + " за 1 " + from + ": ");
        double rate = readPositive(scanner);
        System.out.printf(Locale.US, "%12.2f %-3s × %.6f = %12.2f %-3s%n", amount, from, rate, amount * rate, to);
    }

    private static double readPositive(Scanner scanner) {
        while (true) {
            try {
                double value = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
                if (value > 0 && Double.isFinite(value))
                    return value;
            } catch (NumberFormatException ignored) {}
            System.out.print("Введите положительное число: ");
        }
    }
}
