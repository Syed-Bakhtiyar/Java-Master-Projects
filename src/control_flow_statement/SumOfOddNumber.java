package control_flow_statement;

public class SumOfOddNumber {
    public static void main(String[] args) {
        System.out.println(sumOdd(5, 10));
    }

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if(start < 0 || end < 0){
            return -1;
        }
        if (start > end) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
