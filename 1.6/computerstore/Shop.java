package computerstore;

public class Shop {
    private final Computer[] computers;
    private int count;

    public Shop(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Размер магазина должен быть положительным");
        computers = new Computer[capacity];
    }

    public int getCount() { return count; }
    public boolean isFull() { return count == computers.length; }

    public boolean add(Computer computer) {
        if (isFull()) return false;
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
            Computer computer = computers[i];
            if (computer.getBrand().name().equalsIgnoreCase(query)
                    || computer.getModel().equalsIgnoreCase(query)) {
                return computer;
            }
        }
        return null;
    }

    public void printAll() {
        if (count == 0) System.out.println("Магазин пуст");
        for (int i = 0; i < count; i++) System.out.println(computers[i]);
    }
}
