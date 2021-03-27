package control_flow_statement;

import java.util.Scanner;

public class InputThenPrintSumAndAverage {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                sum += scanner.nextInt();
                counter++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + (long) Math.round(( (double) sum / (double) counter )));
    }
}
