package control_flow_statement;

public class LargestPrimeNumber {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int prime = 2;
        while (number > prime) {
            if (number % prime == 0) {
                number /= prime;
            } else {
                prime++;
            }
        }
        return prime;
    }
}
