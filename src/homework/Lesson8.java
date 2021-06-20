package homework;

public class Lesson8 {
    public static void main(String[] args) {

        String text = "Java is the capital of Great Britain";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'J' || text.charAt(i) == 'v' || text.charAt(i) == 's' || text.charAt(i) == 't' ||
                    text.charAt(i) == 'h' || text.charAt(i) == 'c' || text.charAt(i) == 'p' || text.charAt(i) == 'l' ||
                    text.charAt(i) == 'f' || text.charAt(i) == 'G' || text.charAt(i) == 'g' || text.charAt(i) == 'r' ||
                    text.charAt(i) == 'B' || text.charAt(i) == 'n') {
                System.out.println(text.charAt(i));
            }
        }
    }
}
