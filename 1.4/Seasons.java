enum Season {
    WINTER(-7), SPRING(10), SUMMER(24) {
        @Override public String getDescription() { return "Тёплое время года"; }
    }, AUTUMN(8);

    private final int averageTemperature;
    Season(int averageTemperature) { this.averageTemperature = averageTemperature; }
    public int getAverageTemperature() { return averageTemperature; }
    public String getDescription() { return "Холодное время года"; }
    public String getRussianName() {
        switch (this) {
            case WINTER: return "Зима";
            case SPRING: return "Весна";
            case SUMMER: return "Лето";
            default: return "Осень";
        }
    }
}

public class Seasons {
    private static void describeFavorite(Season season) {
        switch (season) {
            case SUMMER: System.out.println("Я люблю лето"); break;
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
    }

    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года: " + favorite.getRussianName()
                + ", средняя температура " + favorite.getAverageTemperature() + " °C, "
                + favorite.getDescription());
        describeFavorite(favorite);
        for (Season season : Season.values()) {
            System.out.printf("%s: %+d °C — %s%n", season.getRussianName(),
                    season.getAverageTemperature(), season.getDescription());
        }
    }
}
