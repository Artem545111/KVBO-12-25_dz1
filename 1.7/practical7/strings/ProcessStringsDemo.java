package practical7.strings;

public class ProcessStringsDemo {
    public static void main(String[] args) {
        StringProcessor processor = new ProcessStrings();
        String text = "Программирование";
        System.out.println("Строка: " + text);
        System.out.println("Символов: " + processor.countCharacters(text));
        System.out.println("Позиции 1, 3, 5, ...: " + processor.oddPositions(text));
        System.out.println("Инверсия: " + processor.reverse(text));
    }
}
