package first_step;

public class FloatDouble {
    public static void main(String[] args) {
        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value Is: " + floatMinValue);
        System.out.println("Float Maximum Value Is: " + floatMaxValue);

        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value Is: " + doubleMinValue);
        System.out.println("Double Maximum Value Is: " + doubleMaxValue);

        int intValue = 5 / 3;
        float floatValue = 5f / 2f;
        double doubleValue = 5d / 2d;

        System.out.println("Int value is: " + intValue);
        System.out.println("Float Value is: " + floatValue);
        System.out.println("Double Value is: " + doubleValue);
    }
}
