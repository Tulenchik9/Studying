package homework;

public class Triangle {
    public void printTypeTriangle(int a, int b, int c) {
        if ((a + b < c) || (c + b < a) || (a + c < b)) {
            System.out.println("Это не треугольник");
            return;
        }

        if (a != b && a != c && b != c) {
            System.out.println("Это разносторонний треугольник");
        } else if (a == b || a == c || b == c) {
            System.out.println("Это равнобедренный треугольник");
        } else if (a == b && a == c && b == c) {
            System.out.println("Это правильный треугольник");
        }
    }
}
