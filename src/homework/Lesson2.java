package homework;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой возраст: ");
        int inputAge = scanner.nextInt();

        if (inputAge <= 12) {
            System.out.println("Вы ребенок");
        } else if (inputAge > 12 && inputAge <= 16) {
            System.out.println("Вы подросток");
        } else if (inputAge > 16 && inputAge <= 20) {
            System.out.println("Вы тинейджер");
        } else if (inputAge > 20 && inputAge <= 35) {
            System.out.println("Вы молодой");
        } else if (inputAge > 35 && inputAge <= 55) {
            System.out.println("Вы средних лет");
        } else if (inputAge > 55 && inputAge <= 75) {
            System.out.println("Вы пожилой");
        } else if (inputAge > 75 && inputAge <= 90) {
            System.out.println("Вы старик");
        } else if (inputAge > 90) {
            System.out.println("Вы долгожитель");
        }


    }
}
