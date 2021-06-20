package lesson3;

public class Main12 {
    public static void main(String[] args) {

        String password = "qwerty123!";

        int countSpecialSymbols = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == '!' || password.charAt(i) == '?' ||
                    password.charAt(i) == '*' || password.charAt(i) == '/') {
                countSpecialSymbols++;
            }
        }
        if (countSpecialSymbols == 0) {
            System.out.println("Пароль слабоват");
        } else if (countSpecialSymbols > 0 && countSpecialSymbols <= 2) {
            System.out.println("Пароль нормальный");
        } else {
            System.out.println("Пароль хороший");
        }
    }
}
