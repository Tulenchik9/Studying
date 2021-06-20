package homework;

public class NumberUtils {
    public static void countAreaOfTriangle(int side1, int side2, int side3) {
        int perimeter = (side1 + side2 + side3) / 2;
        int area = perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3);
        System.out.println(area);
    }

    public static void countSumOfFractions(int nom1, int nom2, int denom1, int denom2) {
        int comDenom = denom1 * denom2;
        int newNom = (comDenom / denom1 * nom1) + (comDenom / denom2 * nom2);
        System.out.println(newNom + "/" + comDenom);
    }
}
