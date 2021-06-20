package lesson4;

public class Main6 {
    public static void main(String[] args) {
        String word = "hello world";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String codingWord = "";

        for (int i = 0; i < word.length(); i++) {
            char currentCharFromWord = word.charAt(i);
            int indexFromAlphabet = alphabet.indexOf(currentCharFromWord);
            if (indexFromAlphabet != -1) {
                char replacementChar = alphabet.charAt(indexFromAlphabet + 1);
                codingWord = codingWord + replacementChar;
            } else {
                codingWord = codingWord + currentCharFromWord;
            }
        }

        System.out.println(codingWord);
    }
}
