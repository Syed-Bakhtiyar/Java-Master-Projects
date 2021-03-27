package expressions_statements_codeBlocks_methods;

public class EqualSumCheckerExample {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,0, 1));
    }

    public static boolean hasEqualSum(int value1, int value2, int expectedSum) {
        return (value1 + value2) == expectedSum;
    }
}
