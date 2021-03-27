package control_flow_statement;

public class PrintFactorsExcersice {
    public static void main(String[] args) {
        printFactors(32);
    }

    public static void printFactors (int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        String factor = "";
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                factor += i + " ";
            }
        }
        System.out.println(factor);
    }
}
