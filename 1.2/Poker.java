import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int players;
        while (true) {
            System.out.print("Количество игроков (1–10): ");
            try {
                players = Integer.parseInt(scanner.nextLine().trim());
                if (players >= 1 && players <= 10) break;
            } catch (NumberFormatException ignored) {}
            System.out.println("Введите целое число от 1 до 10: в колоде 52 карты.");
        }
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
        String[] suits = {"Пики", "Черви", "Буби", "Трефы"};
        String[] deck = new String[52];
        int index = 0;
        for (String suit : suits) for (String rank : ranks) deck[index++] = rank + suit;
        for (int i = deck.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        for (int player = 0; player < players; player++) {
            System.out.println("Игрок " + (player + 1) + ":");
            for (int card = 0; card < 5; card++) System.out.println(deck[player * 5 + card]);
            System.out.println();
        }
    }
}
