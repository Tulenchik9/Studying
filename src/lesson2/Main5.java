package lesson2;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону треугольника: ");
        int inputA = scanner.nextInt();

        System.out.println("Ведите вторую сторону треугольника: ");
        int inputB = scanner.nextInt();

        System.out.println("Ведите третью сторону треугольника: ");
        int inputC = scanner.nextInt();

        if((inputA > inputB + inputC) || (inputB > inputA + inputC) || (inputC > inputA + inputB)) {
            System.out.println("Треугольник с такими сторонами не существует");
            return;
        }

        System.out.println("Периметр треугольника: " + (inputA + inputB + inputC));

        double p = (inputA + inputB + inputC) / 2;
        double s = Math.sqrt(p*(p - inputA)*(p - inputB)*(p - inputC));
        System.out.println("Площадь треугольника: " + s);

    }


}
