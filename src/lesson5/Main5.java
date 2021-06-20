package lesson5;

import java.util.concurrent.ThreadLocalRandom;

public class Main5 {
    public static void main(String[] args) {
        int[][] saper = new int[10][10];

        for (int i = 0; i < 10; i++) {
            int randomRow = ThreadLocalRandom.current().nextInt(0, saper.length);
            int randomColumn = ThreadLocalRandom.current().nextInt(0, saper[0].length);
            saper[randomRow][randomColumn] = -1;
        }

        for (int i = 0; i < saper.length; i++) {
            for (int j = 0; j < saper[i].length; j++) {
                System.out.print(saper[i][j] + " ");
            }
            System.out.println();
        }
    }
}
