package lesson7;

public class Main {
    public static void main(String[] args) {
        Tovar chainik1 = new Tovar();
        Tovar chainik2 = new Tovar();

        chainik1.setId(456);
        chainik2.setId(56896);

        chainik1.setName("Чайник электрический");
        chainik2.setName("Чайник");

        int idChainik = chainik1.getId();
        System.out.println(idChainik);

        Pen pen = new Pen();
        pen.setName("Шариковая ручка");
    }
}
