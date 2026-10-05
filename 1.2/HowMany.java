import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст (завершите ввод пустой строкой):");
        int count = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) break;
            Scanner words = new Scanner(line);
            while (words.hasNext()) {
                words.next();
                count++;
            }
            words.close();
        }
        System.out.println("Количество слов: " + count);
    }
}
