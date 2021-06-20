package homework;

public class Lesson14 {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше";

        String[] wordsFromText = text.split(" ");

        for (int i = wordsFromText.length - 1; i >= 0; i--) {
            System.out.println(wordsFromText[i]);
        }
    }
}
