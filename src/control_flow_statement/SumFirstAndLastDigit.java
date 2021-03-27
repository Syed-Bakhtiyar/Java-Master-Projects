package control_flow_statement;

public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(256));
        System.out.println(sumFirstAndLastDigit(1));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        if(number < 10){
            return number + number;
        }
        int firstDigit = number;
        int lastDigit = number % 10;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        return  firstDigit + lastDigit;
    }
}
