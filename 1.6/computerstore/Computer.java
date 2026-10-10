package computerstore;

public class Computer {
    private final Brand brand;
    private final String model;
    private final double price;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    public Computer(Brand brand, String model, double price,
                    Processor processor, Memory memory, Monitor monitor) {
        if (price <= 0 || !Double.isFinite(price)) {
            throw new IllegalArgumentException("Цена должна быть положительной");
        }
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPrice() { return price; }
    public Processor getProcessor() { return processor; }
    public Memory getMemory() { return memory; }
    public Monitor getMonitor() { return monitor; }

    @Override
    public String toString() {
        return brand + " " + model + ", цена: " + price + " руб."
                + "\n  Процессор: " + processor
                + "\n  Память: " + memory
                + "\n  Монитор: " + monitor;
    }
}
