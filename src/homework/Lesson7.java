package homework;

public class Lesson7 {
    public static void main(String[] args) {

        String text = "Java is the capital of Great Britain";
        int summa = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                summa++;
            }
        }
        System.out.println(summa);
    }
}
