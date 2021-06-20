package homework;

public class Square {
    public void printPloshad(int a) {
        if (a <= 0) {
            System.out.println("Это не квадрат");
            return;
        }
        System.out.println(a * a);
    }

    public void printPerimetr(int a) {
        if (a <= 0) {
            System.out.println("Это не квадрат");
            return;
        }
        System.out.println(a * 4);
    }
}
