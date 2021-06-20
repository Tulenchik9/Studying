package lesson1;

public class MySecondProject {

    public static void main(String[] args) {
        double roomWeight = 5.8;
        double roomLength = 4;

        double tableWeight = 2;
        double tableLength = 2.6;

        double ploshadRoom = roomWeight * roomLength;
        double ploshadTable = tableLength * tableWeight;

        int countTableToInsertToRoom = (int) (ploshadRoom / ploshadTable);
        System.out.println("Столов влезет в комнату: " + countTableToInsertToRoom);

        double freePloshad = ploshadRoom - countTableToInsertToRoom * ploshadTable;
        System.out.println("Свободная площадь: " + freePloshad);

        }

    }
