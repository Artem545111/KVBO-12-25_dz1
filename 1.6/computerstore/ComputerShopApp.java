package computerstore;

import java.util.Scanner;

public class ComputerShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        ConsoleComputerInput console = new ConsoleComputerInput(scanner);
        ComputerInput input = console;
        Shop shop = new Shop(20);
        int initialCount = console.readInt("Сколько компьютеров ввести (0–20): ", 0, 20);
        for (int i = 0; i < initialCount; i++) {
            System.out.println("Компьютер " + (i + 1));
            shop.add(input.readComputer());
        }

        while (true) {
            System.out.println("1 — добавить, 2 — удалить, 3 — найти, 4 — список, 0 — выход");
            int command = console.readInt("Команда: ", 0, 4);
            if (command == 0) break;
            switch (command) {
                case 1:
                    if (shop.isFull()) {
                        System.out.println("Магазин заполнен");
                    } else {
                        shop.add(input.readComputer());
                        System.out.println("Компьютер добавлен");
                    }
                    break;
                case 2:
                    String model = console.readText("Модель для удаления: ");
                    boolean removed = shop.remove(model);
                    System.out.println(removed ? "Удалено" : "Не найдено");
                    break;
                case 3:
                    String query = console.readText("Марка или модель для поиска: ");
                    Computer found = shop.find(query);
                    System.out.println(found == null ? "Не найдено" : found);
                    break;
                case 4:
                    shop.printAll();
                    break;
            }
        }
        scanner.close();
    }
}
