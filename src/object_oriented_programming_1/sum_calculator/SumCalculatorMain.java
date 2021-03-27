package object_oriented_programming_1.sum_calculator;

public class SumCalculatorMain {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        sumCalculator.setFirstNumber(20);
        sumCalculator.setSecondNumber(2);

        System.out.println("add: " + sumCalculator.getAdditionResult());
        System.out.println("subtract: " + sumCalculator.getSubtractionResult());
        System.out.println("Multiply: " + sumCalculator.getMultiplicationResult());
        System.out.println("Divide: " + sumCalculator.getDivisionResult());
    }
}
