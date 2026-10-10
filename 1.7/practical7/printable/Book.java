package practical7.printable;

public class Book implements Printable {
    private final String title;
    public Book(String title) { this.title = title; }
    public String getTitle() { return title; }
    public void print() { System.out.println("Книга: " + title); }
    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) if (item instanceof Book) System.out.println(((Book) item).getTitle());
    }
}
