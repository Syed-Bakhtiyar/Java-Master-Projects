package expressions_statements_codeBlocks_methods;

public class HasTeenExcercise {
    public static void main(String[] args) {
        System.out.println(hasTeen(2,19,2));
    }

    public static boolean hasTeen(int val1, int val2, int val3) {
        int startInclusive = 13;
        int endInclusive = 19;
        return (val1 >= startInclusive && val1 <= endInclusive) || (val2 >= startInclusive && val2 <= endInclusive) || (val3 >= startInclusive && val3 <= endInclusive);
    }

    public static boolean isTeen(int value) {
        return value >= 13 && value <= 19;
    }

}
