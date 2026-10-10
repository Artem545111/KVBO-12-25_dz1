package practical7.strings;

public class ProcessStrings implements StringProcessor {
    public int countCharacters(String text) {
        return text.length();
    }
    public String oddPositions(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i += 2) result.append(text.charAt(i));
        return result.toString();
    }
    public String reverse(String text) { return new StringBuilder(text).reverse().toString(); }
}
