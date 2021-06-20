package lesson3;

public class Main10 {
    public static void main(String[] args) {

        String text = "mog napisat";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'o' || text.charAt(i) == 'a' || text.charAt(i) == 'i') {
                System.out.println(text.charAt(i));
            }
        }
    }
}
