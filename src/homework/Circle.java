package homework;

public class Circle {
    private int radius;

    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void printPloshad() {
        if (radius <= 0) {
            System.out.println("Это не круг");
            return;
        }
        System.out.println(3.1415 * radius * radius);
    }

    public void printPerimetr() {
        if (radius <= 0) {
            System.out.println("Это не круг");
            return;
        }
        System.out.println(2 * 3.1415 * radius);
    }
}
