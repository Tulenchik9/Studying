package homework;

public class Lesson13 {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше";

        String[] wordsFromText = text.split(" ");

        for (int i = 0; i < wordsFromText.length; i++) {
            System.out.println(wordsFromText[i]);
        }
    }
}