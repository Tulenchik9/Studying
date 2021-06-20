package homework;

public class Lesson1 {

    public static void main(String[] args) {
        double allMoney = 1000;
        double priceOfPizza = 230;
        double priceOfBubbleGum = 26;
        double priceOfSweet = 2.5;

        int maxPizza = (int) (allMoney / priceOfPizza);
        System.out.println("Максимальное количество пицц: " + maxPizza);

        double sdachaOfPizza = allMoney - maxPizza * priceOfPizza;

        int maxBubbleGum = (int) (sdachaOfPizza / priceOfBubbleGum);
        System.out.println("Максимальное количество жвачек: " + maxBubbleGum);

        double sdachaOfBubbleGum = sdachaOfPizza - maxBubbleGum * priceOfBubbleGum;

        int maxSweet = (int) (sdachaOfBubbleGum / priceOfSweet);
        System.out.println("Максимальное количество конфет: " + maxSweet);

        double allSdacha = sdachaOfBubbleGum;
        System.out.println("Оставшаяся сдача: " + allSdacha);








    }
}
