package homework;

import java.util.concurrent.ThreadLocalRandom;

public class Lesson15 {
    public static void main(String[] args) {
        char[][] homework = new char[10][10];

        for (int i = 0; i < 20; i++) {
            int randomRow = ThreadLocalRandom.current().nextInt(0, homework.length);
            int randomColumn = ThreadLocalRandom.current().nextInt(0, homework[0].length);
            homework[randomRow][randomColumn] = 'x';
        }

        for (int i = 0; i < 20; i++) {
            int randomRow = ThreadLocalRandom.current().nextInt(0, homework.length);
            int randomColumn = ThreadLocalRandom.current().nextInt(0, homework[0].length);

            if (homework[randomRow][randomColumn] == 'x') {
                homework[randomRow][randomColumn] = 'z';
            } else {
                homework[randomRow][randomColumn] = 'y';
            }
        }

        for (int i = 0; i < homework.length; i++) {
            for (int j = 0; j < homework[i].length; j++) {
                System.out.print(homework[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
