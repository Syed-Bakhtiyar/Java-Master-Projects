package control_flow_statement;

public class HasSharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int val1, int val2) {
        if(val1 < 10 || val1 > 99 || val2 < 10 || val2 > 99){
            return false;
        }
        int val1FirstDigit = val1 / 10;
        int val1LastDigit = val1 % 10;
        int val2FirstDigit = val2 / 10;
        int val2LastDigit = val2 % 10;
        return (val1FirstDigit == val2FirstDigit) || (val1FirstDigit == val2LastDigit)  || (val1LastDigit == val2FirstDigit ) || (val1LastDigit == val2LastDigit) ;
    }
}
