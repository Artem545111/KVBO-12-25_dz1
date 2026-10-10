package computerstore;

public class Monitor {
    private final double diagonalInches;
    private final String resolution;

    public Monitor(double diagonalInches, String resolution) {
        if (diagonalInches <= 0 || !Double.isFinite(diagonalInches)) {
            throw new IllegalArgumentException("Диагональ должна быть положительной");
        }
        this.diagonalInches = diagonalInches;
        this.resolution = resolution;
    }

    public double getDiagonalInches() { return diagonalInches; }
    public String getResolution() { return resolution; }

    @Override
    public String toString() {
        return diagonalInches + " дюймов, " + resolution;
    }
}
