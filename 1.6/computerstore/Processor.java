package computerstore;

public class Processor {
    private final String model;
    private final int cores;
    private final double frequencyGHz;

    public Processor(String model, int cores, double frequencyGHz) {
        if (cores <= 0 || frequencyGHz <= 0 || !Double.isFinite(frequencyGHz)) {
            throw new IllegalArgumentException("Характеристики процессора должны быть положительными");
        }
        this.model = model;
        this.cores = cores;
        this.frequencyGHz = frequencyGHz;
    }

    public String getModel() { return model; }
    public int getCores() { return cores; }
    public double getFrequencyGHz() { return frequencyGHz; }

    @Override
    public String toString() {
        return model + ", ядер: " + cores + ", частота: " + frequencyGHz + " ГГц";
    }
}
