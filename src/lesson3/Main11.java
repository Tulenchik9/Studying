package lesson3;

public class Main11 {
    public static void main(String[] args) {

        String text = "Luboi pobolshe";
        int summa = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'u' || text.charAt(i) == 'o' || text.charAt(i) == 'i' || text.charAt(i) == 'e'){
                summa++;
            }
        }
        System.out.println(summa);
    }
}
