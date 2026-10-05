import java.util.Scanner;

class Computer {
    private final String brand;
    private final String model;
    private final double price;

    Computer(String brand, String model, double price) {
        if (price < 0) throw new IllegalArgumentException("Цена не может быть отрицательной");
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    @Override public String toString() { return brand + " " + model + " — " + price; }
}

class Shop {
    private final Computer[] computers;
    private int count;

    Shop(int capacity) { computers = new Computer[capacity]; }
    public boolean add(Computer computer) {
        if (count == computers.length) return false;
        computers[count++] = computer;
        return true;
    }
    public boolean remove(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                for (int j = i; j < count - 1; j++) computers[j] = computers[j + 1];
                computers[--count] = null;
                return true;
            }
        }
        return false;
    }
    public Computer find(String query) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getBrand().equalsIgnoreCase(query)
                    || computers[i].getModel().equalsIgnoreCase(query)) return computers[i];
        }
        return null;
    }
    public void printAll() {
        if (count == 0) System.out.println("Магазин пуст");
        for (int i = 0; i < count; i++) System.out.println(computers[i]);
    }
}

public class ShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop(20);
        while (true) {
            System.out.println("1 — добавить, 2 — удалить, 3 — найти, 4 — список, 0 — выход");
            String command = scanner.nextLine().trim();
            if (command.equals("0")) break;
            switch (command) {
                case "1":
                    System.out.print("Марка: "); String brand = scanner.nextLine().trim();
                    System.out.print("Модель: "); String model = scanner.nextLine().trim();
                    System.out.print("Цена: ");
                    try {
                        double price = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
                        if (!shop.add(new Computer(brand, model, price)))
                            System.out.println("Магазин заполнен");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Неверная цена");
                    }
                    break;
                case "2":
                    System.out.print("Модель для удаления: ");
                    System.out.println(shop.remove(scanner.nextLine().trim()) ? "Удалено" : "Не найдено");
                    break;
                case "3":
                    System.out.print("Марка или модель для поиска: ");
                    Computer found = shop.find(scanner.nextLine().trim());
                    System.out.println(found == null ? "Не найдено" : found);
                    break;
                case "4": shop.printAll(); break;
                default: System.out.println("Неизвестная команда");
            }
        }
    }
}
