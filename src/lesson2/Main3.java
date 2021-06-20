package lesson2;

public class Main3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;
        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник!");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник!");
        } else{
            System.out.println("Это равнобедренный треугольник!");
        }


    }
}
