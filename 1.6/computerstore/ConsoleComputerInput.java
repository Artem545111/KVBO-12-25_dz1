package computerstore;

import java.util.Scanner;

public class ConsoleComputerInput implements ComputerInput {
    private final Scanner scanner;

    public ConsoleComputerInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readText(String prompt) {
        while (true) {
            System.out.print(prompt);
            String text = scanner.nextLine().trim();
            if (!text.isEmpty()) return text;
            System.out.println("Введите непустую строку.");
        }
    }

    public int readInt(String prompt, int minimum, int maximum) {
        while (true) {
            String text = readText(prompt);
            try {
                int value = Integer.parseInt(text);
                if (value >= minimum && value <= maximum) return value;
            } catch (NumberFormatException ignored) {
                System.out.println("Неверный формат целого числа.");
            }
            System.out.println("Допустимый диапазон: " + minimum + "–" + maximum);
        }
    }

    public double readPositiveDouble(String prompt) {
        while (true) {
            String text = readText(prompt).replace(',', '.');
            try {
                double value = Double.parseDouble(text);
                if (value > 0 && Double.isFinite(value)) return value;
            } catch (NumberFormatException ignored) {
                System.out.println("Неверный формат числа.");
            }
            System.out.println("Введите конечное число больше нуля.");
        }
    }

    public Brand readBrand() {
        Brand[] brands = Brand.values();
        for (int i = 0; i < brands.length; i++) {
            System.out.println((i + 1) + " — " + brands[i]);
        }
        int choice = readInt("Номер марки: ", 1, brands.length);
        return brands[choice - 1];
    }

    @Override
    public Computer readComputer() {
        Brand brand = readBrand();
        String model = readText("Модель компьютера: ");
        double price = readPositiveDouble("Цена в рублях: ");
        String cpuModel = readText("Модель процессора: ");
        int cores = readInt("Количество ядер: ", 1, Integer.MAX_VALUE);
        double frequency = readPositiveDouble("Частота процессора в ГГц: ");
        Processor processor = new Processor(cpuModel, cores, frequency);
        String memoryType = readText("Тип памяти (например, DDR5): ");
        int capacity = readInt("Объём памяти в ГБ: ", 1, Integer.MAX_VALUE);
        Memory memory = new Memory(memoryType, capacity);
        double diagonal = readPositiveDouble("Диагональ монитора в дюймах: ");
        String resolution = readText("Разрешение монитора (например, 1920x1080): ");
        Monitor monitor = new Monitor(diagonal, resolution);
        return new Computer(brand, model, price, processor, memory, monitor);
    }
}
