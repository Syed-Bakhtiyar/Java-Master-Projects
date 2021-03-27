package control_flow_statement;

public class GreatestCommonDivisorExcercise {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        if(number1 < 10 || number2 < 10){
            return -1;
        }

        for (int i = number1; i >= 1; i--){
            if(number1 % i == 0){
                for (int j = number2; j >= 1; j--){
                    if(number2 % j == 0){
                        if(i == j){
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
