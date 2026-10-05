class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{name='" + name + "', email='" + email + "', gender=" + gender + "}";
    }
}

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Александр Пушкин", "pushkin@example.ru", 'M');
        System.out.println(author);
        System.out.println(author.getName() + ", " + author.getGender());
        author.setEmail("alexander@example.ru");
        System.out.println("Новая почта: " + author.getEmail());
    }
}
