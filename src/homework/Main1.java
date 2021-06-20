package homework;

public class Main1 {
    public static void main(String[] args) {
        Square square = new Square();
        square.printPloshad(4);
        square.printPerimetr(5);

        Rectangle rectangle = new Rectangle();
        rectangle.printPloshad(6, 9);
        rectangle.printPerimetr(7, 3);

        Triangle triangle = new Triangle();
        triangle.printTypeTriangle(4, 4, 8);

        Circle circle = new Circle(0);
        circle.printPloshad();
        circle.printPerimetr();
    }
}
