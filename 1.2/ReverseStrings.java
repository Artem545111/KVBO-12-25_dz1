public class ReverseStrings {
    public static void main(String[] args) {
        String[] words = {"первый", "второй", "третий", "четвёртый"};
        System.out.print("До: ");
        print(words);
        for (int left = 0, right = words.length - 1; left < right; left++, right--) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
        }
        System.out.print("После: ");
        print(words);
    }

    private static void print(String[] words) {
        for (String word : words) System.out.print(word + " ");
        System.out.println();
    }
}
