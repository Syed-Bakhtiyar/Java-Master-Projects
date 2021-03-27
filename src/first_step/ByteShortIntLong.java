package first_step;

public class ByteShortIntLong {
    public static void main(String[] args) {
        int integerMinimumValue = Integer.MIN_VALUE;
        int integerMaximumValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value Is: " + integerMinimumValue);
        System.out.println("Integer Maximum Value Is: " + integerMaximumValue);

        byte byteMinimumValue = Byte.MIN_VALUE;
        byte byteMaximumValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value Is: " + byteMinimumValue);
        System.out.println("Byte Minimum Value Is: " + byteMaximumValue);

        short shortMinimumValue = Short.MIN_VALUE;
        short shortMaximumValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value Is: " + shortMinimumValue);
        System.out.println("Short Minimum Value Is: " + shortMaximumValue);

        long longMinimumValue = Long.MIN_VALUE;
        long longMaximumValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value Is: " + longMinimumValue);
        System.out.println("Long Maximum Value Is: " + longMaximumValue);

        int myIntMinimumValueDivision =  (integerMinimumValue / 2);

        // casting
        byte myByteMinimumValueDivision = (byte) (byteMinimumValue / 2);

    }
}
