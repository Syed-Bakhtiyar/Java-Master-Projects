package control_flow_statement;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 10){
            System.out.println("Enter a number " + count + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Number is Invalid");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The sum is: " + sum);
    }
}
