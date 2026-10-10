package practical7.printable;

public class Magazine implements Printable {
    private final String title;
    public Magazine(String title) { this.title = title; }
    public String getTitle() { return title; }
    public void print() { System.out.println("Журнал: " + title); }
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) if (item instanceof Magazine) System.out.println(((Magazine) item).getTitle());
    }
}
