package control_flow_statement;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Write First Number: ");
            boolean hasNumber1 = scanner.hasNextInt();
            System.out.println("Write Second Number: ");
            boolean hasNumber2 = scanner.hasNextInt();
            if(hasNumber1 && hasNumber2){
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                if(number1 > number2){
                    System.out.println("Number1 has Max: " + number1);
                }
                if(number1 < number2){
                    System.out.println("Number2 has Max: " + number2);
                }
                if(number1 == number2){
                    System.out.println("Both has the same");
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
        }
        scanner.close();
    }
}
