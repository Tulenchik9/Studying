package homework;

public class Rectangle {
    public void printPloshad(int a, int b) {
        if (a == b || a <= 0 || b <= 0) {
            System.out.println("Это не прямоугольник");
            return;
        }
        System.out.println(a * b);
    }

    public void printPerimetr(int a, int b) {
        if (a == b || a <= 0 || b <= 0) {
            System.out.println("Это не прямоугольник");
            return;
        }
        System.out.println(2 * (a + b));
    }
}
