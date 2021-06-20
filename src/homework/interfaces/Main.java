package homework.interfaces;

public class Main {
    public static void main(String[] args) {

        FractionNumberImpl drob1 = new FractionNumberImpl(4, 8);
        FractionNumberImpl drob2 = new FractionNumberImpl(5, 9);

        FractionNumberOperationImpl calculator = new FractionNumberOperationImpl();
        FractionNumber resultAdd = calculator.add(drob1, drob2);
        System.out.println(resultAdd);

        FractionNumber resultSub = calculator.sub(drob1, drob2);
        System.out.println(resultSub);

        FractionNumber resultMul = calculator.mul(drob1, drob2);
        System.out.println(resultMul);

        FractionNumber resultDiv = calculator.div(drob1, drob2);
        System.out.println(resultDiv);
    }
}
