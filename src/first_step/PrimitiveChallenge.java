package first_step;

public class PrimitiveChallenge {
    public static void main(String[] args) {
        int intNumber = 5;
        byte byteNumber = 5;
        short shortNumber = 5;

        long finalValue = 50000 + (intNumber + byteNumber + shortNumber) * 10 ;
        System.out.println(finalValue);
    }
}
