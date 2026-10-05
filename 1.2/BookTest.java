class Book {
    private String author, title;
    private int year;
    Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    @Override public String toString() { return title + " — " + author + " (" + year + ")"; }
}

class Bookshelf {
    private final Book[] books;
    private int count;
    Bookshelf(int capacity) { books = new Book[capacity]; }
    public void addBook(String author, String title, int year) {
        if (count == books.length) throw new IllegalStateException("Полка заполнена");
        books[count++] = new Book(author, title, year);
    }
    public int getCount() { return count; }
    public Book earliest() {
        if (count == 0) return null;
        Book result = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < result.getYear()) result = books[i];
        }
        return result;
    }
    public Book latest() {
        if (count == 0) return null;
        Book result = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > result.getYear()) result = books[i];
        }
        return result;
    }
    public void sortByYear() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (books[j].getYear() < books[i].getYear()) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }
    public Book getBook(int index) { return books[index]; }
}

public class BookTest {
    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf(3);
        shelf.addBook("Л. Толстой", "Война и мир", 1869);
        shelf.addBook("А. Пушкин", "Капитанская дочка", 1836);
        shelf.addBook("Ф. Достоевский", "Преступление и наказание", 1866);
        System.out.println("Книг: " + shelf.getCount());
        System.out.println("Ранняя: " + shelf.earliest());
        System.out.println("Поздняя: " + shelf.latest());
        shelf.sortByYear();
        System.out.println("Книги по году издания:");
        for (int i = 0; i < shelf.getCount(); i++) System.out.println(shelf.getBook(i));
    }
}