package practical7.printable;

public class PrintableFiltersDemo {
    public static void main(String[] args) {
        Printable[] items = {
            new Book("Война и мир"), new Magazine("Наука и жизнь"),
            new Book("Мастер и Маргарита"), new Magazine("Вокруг света")
        };
        for (Printable item : items) item.print();
        System.out.println("Только журналы:"); Magazine.printMagazines(items);
        System.out.println("Только книги:"); Book.printBooks(items);
    }
}
