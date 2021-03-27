package control_flow_statement;

public class ForStatementOrLoopExample {
    public static void main(String[] args) {
        for(int i = 2; i <= 8; i++){
            double interest = calculateInterest(10000, i);
            System.out.println("Interest Calculated Rate: " + String.format("%.2f", interest));
        }

        for(int i = 8; i >= 2; i--){
            double interest = calculateInterest(10000, i);
            System.out.println("Interest Calculated Rate: " + String.format("%.2f", interest));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
