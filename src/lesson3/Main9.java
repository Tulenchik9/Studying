package lesson3;

public class Main9 {
    public static void main(String[] args) {

        String text = "любой текст";
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.println(text.charAt(i));
        }
    }
}
