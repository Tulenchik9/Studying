package homework;

public class Lesson4 {
    public static void main(String[] args) {

        int summa = 0;
        for (int i = 50; i <= 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
            }
            summa = i + summa;
        }
        System.out.println(summa);
    }
}
