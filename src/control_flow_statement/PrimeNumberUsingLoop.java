package control_flow_statement;

public class PrimeNumberUsingLoop {
    public static void main(String[] args) {

        int count = 0;
        for(int i = 1; i <= 1000; i++ ){
            if (isPrime(i)){
                count++;
                System.out.println(i + " is prime");
                if(count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1){
            return false;
        }
                            // n / 2
        for (int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
