package expressions_statements_codeBlocks_methods;

public class DecimalComparatorExcercise {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {
        return (int) (value1 * 1000) == (int) (value2 * 1000);
    }
}
