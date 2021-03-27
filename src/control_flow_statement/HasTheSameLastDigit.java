package control_flow_statement;

public class HasTheSameLastDigit {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(43, 22, 71));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if(number1 < 10 || number1 > 1000 ||
           number2 < 10 || number2 > 1000 ||
           number3 < 10 || number3 > 1000){
            return false;
        }
        int lastDigitOfNo1 = number1 % 10;
        int lastDigitOfNo2 = number2 % 10;
        int lastDigitOfNo3 = number3 % 10;
        return lastDigitOfNo1 == lastDigitOfNo2 || lastDigitOfNo1 == lastDigitOfNo3 || lastDigitOfNo2 == lastDigitOfNo3;
    }

    public static boolean isValid(int number) {
        if(number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
