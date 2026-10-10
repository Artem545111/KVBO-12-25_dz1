package computerstore;

public class Memory {
    private final String type;
    private final int capacityGB;

    public Memory(String type, int capacityGB) {
        if (capacityGB <= 0) throw new IllegalArgumentException("Объём памяти должен быть положительным");
        this.type = type;
        this.capacityGB = capacityGB;
    }

    public String getType() { return type; }
    public int getCapacityGB() { return capacityGB; }

    @Override
    public String toString() {
        return type + ", " + capacityGB + " ГБ";
    }
}
