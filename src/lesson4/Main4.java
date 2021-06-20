package lesson4;

public class Main4 {
    public static void main(String[] args) {
        String text = "Java is the .. ";

        char[] symbolsFromText = text.toCharArray();

        for (int i = symbolsFromText.length - 1; i >= 0; i--) {
            System.out.print(symbolsFromText[i]);
        }
    }
}
