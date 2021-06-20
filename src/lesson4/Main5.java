package lesson4;

public class Main5 {
    public static void main(String[] args) {
        String email = "fsd@fdsf.vom";

        String[] partsOfEmail = email.split("@");

        if (partsOfEmail.length == 1) {
            System.out.println("Нет собачки!!!");
            return;
        }

        if (partsOfEmail.length > 2) {
            System.out.println("Больше одной собачки!!!");
            return;
        }

        if (partsOfEmail[0].startsWith(".") || partsOfEmail[0].endsWith(".")) {
            System.out.println("Точка в начале или в конце почты!!!");
            return;
        }

        if (partsOfEmail[1].startsWith(".") || partsOfEmail[1].endsWith(".")) {
            System.out.println("Точка в начале или в конце домена почты!!!");
            return;
        }

        if (partsOfEmail[1].indexOf(".") == -1) {
            System.out.println("В домене нет точки!!!");
            return;
        }

        System.out.println("Email верный");
    }
}
